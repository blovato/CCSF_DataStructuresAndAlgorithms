package project_e;

import java.io.*;
import java.text.*;
import java.util.*;
import java.time.*;

public class ProjectEPartBDriver {

    public static void main(String[] args) throws IOException, ParseException {

        List<PoliceReport> reportList = readList();
        BinarySearchTreeWithDups<PoliceReport> reportTree;

        System.out.println("SECTION A: TREE BUILT FROM A SORTED LIST, ASCENDING");
        Collections.sort(reportList);
        reportTree = buildTreeFromList(reportList);
        processTreeAndList(reportTree, reportList);

        System.out.println("\nSECTION B: TREE BUILT FROM A SHUFFLED LIST");
        Collections.shuffle(reportList);
        reportTree = buildTreeFromList(reportList);
        processTreeAndList(reportTree, reportList);

        System.out.println("\nEXTRA CREDIT: UNIQUE VALUES");
        System.out.println("Unique Values (with all reports read in) \t4681: " + reportTree.countUniqueValues());

        System.out.println("\nSECTION C: TREE BUILT FROM A SORTED LIST, DESCENDING");
        Collections.sort(reportList);
        Collections.reverse(reportList);
        reportTree = buildTreeFromList(reportList);
        processTreeAndList(reportTree, reportList);

    }

    private static void processTreeAndList(BinarySearchTreeWithDups<PoliceReport> tree, List<PoliceReport> list) {

        // these represent the earliest date, latest date, two dates in the middle, a high-frequency date, and two dates not in the set
        String[] dateStrings = {"1/1/2003", "10/27/2015", "10/02/2009", "03/23/2010", "03/28/2015", "11/9/2018", "11/9/2000"};
        for (String date : dateStrings) {
            PoliceReport dummyReport = new PoliceReport();
            dummyReport.setDate(date);

            Instant start = Instant.now();
            int reportCountTree = tree.countEntriesNonRecursive(dummyReport);
            long elapsedTimeTree = Duration.between(start, Instant.now()).toMillis();

            start = Instant.now();
            long reportCountList = list.stream().filter(report -> report.equals(dummyReport)).count();
            /* the above is code that uses Java 8 streams (which we do not cover)
			 * here is what the non-stream code would look like:
			long reportCountL = 0;
			for(PoliceReport report : list) {
				if(report.equals(dummyReport)) {
					reportCountL++;
				}
			}
             */
            long elapsedTimeList = Duration.between(start, Instant.now()).toMillis();

            System.out.println("Incident Date: " + date);
            System.out.println("Number of incidents:\t\tTree: " + reportCountTree + " \tList: " + reportCountList);
            System.out.println("Time required:\t\t\tTree: " + elapsedTimeTree + " \tList: " + elapsedTimeList);
            System.out.println();
        }
    }

    private static List<PoliceReport> readList() throws IOException {

        List<PoliceReport> masterReportList = new ArrayList<>();

        String fileName = "SFPD_Incidents_TheftLarceny.csv";
        Scanner fileScan = new Scanner(new File(fileName));

        fileScan.nextLine(); // read the column headers

        // adjust how many records you read in- lower the maxRecords if your machine is taking too long!
        // set limitRecordsRead to false if you want to read in the whole data file
        // if you do this, I recommend commenting out Section C above
        boolean limitRecordsRead = true;
        int maxRecords = 40000;

        int numRecordsReadIn = 0;
        while (fileScan.hasNextLine()
                && (!limitRecordsRead || (limitRecordsRead && numRecordsReadIn < maxRecords))) {
            numRecordsReadIn++;
            String singleReport = fileScan.nextLine();
            Scanner reportScan = new Scanner(singleReport);
            reportScan.useDelimiter(",");

            // this code assumes the file is perfectly formatted- it does not
            // account for errors in formatting
            PoliceReport report = new PoliceReport(
                    Long.parseLong(reportScan.next()), // incident number
                    reportScan.next(), // category
                    reportScan.next(), // description
                    reportScan.next(), // day
                    reportScan.next(), // date
                    reportScan.next(), // district
                    reportScan.next(), // resolution
                    reportScan.next() // address
            );
            masterReportList.add(report);
        }
        return masterReportList;
    }

    private static BinarySearchTreeWithDups<PoliceReport> buildTreeFromList(List<PoliceReport> list) {
        Instant start = Instant.now();
        BinarySearchTreeWithDups<PoliceReport> reportTree = new BinarySearchTreeWithDups<PoliceReport>();
        int count = 0;
        for (PoliceReport report : list) {
            reportTree.add(report);
            count++;
            if (count % 5000 == 0) {
                System.out.println("\t...building tree with entry " + count);
            }
        }
        long elapsedTime = Duration.between(start, Instant.now()).toMillis();
        System.out.println("Time required to build tree: " + elapsedTime + " milliseconds");

        System.out.println("Root is " + reportTree.getRootData());
        try {
            System.out.println("Number of nodes: " + reportTree.getRootNode().getNumberOfNodes());
        } catch (StackOverflowError ex) {
            System.out.println("Cannot find the number of nodes! Stack overflow.");
        }
        System.out.println("Number of nodes equal to the root: " + reportTree.countEntriesNonRecursive(reportTree.getRootNode().getData()));
        System.out.println("Number of nodes bigger than root: " + reportTree.countGreaterWithStack(reportTree.getRootData()));
        if (reportTree.getRootNode().hasLeftChild()) {
            try {
                System.out.println("Number of nodes in left subtree: " + reportTree.getRootNode().getLeftChild().getNumberOfNodes());
            } catch (StackOverflowError ex) {
                System.out.println("Cannot find the number of nodes in the left subtree! Stack overflow.");
            }
        } else {
            System.out.println("Number of nodes in left subtree: 0");
        }
        if (reportTree.getRootNode().hasRightChild()) {
            try {
                System.out.println("Number of nodes in right subtree: " + reportTree.getRootNode().getRightChild().getNumberOfNodes());
            } catch (StackOverflowError ex) {
                System.out.println("Cannot find the number of nodes in the right subtree! Stack overflow.");
            }
        } else {
            System.out.println("Number of nodes in right subtree: 0");
        }
        try {
            System.out.println("Left height: " + reportTree.getLeftHeight());
        } catch (StackOverflowError ex) {
            System.out.println("Cannot find the left height! Stack overflow.");
        }
        try {
            System.out.println("Right height: " + reportTree.getRightHeight());
        } catch (StackOverflowError ex) {
            System.out.println("Cannot find the right height! Stack overflow.");
        }
        System.out.println("Tree build and report complete!\n");

        return reportTree;
    }
}
