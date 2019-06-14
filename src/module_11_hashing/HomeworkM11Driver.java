package module_11_hashing;

import java.util.*;

public class HomeworkM11Driver {

    public static void main(String[] args) {

//        Student s1 = new Student(123, "Sam", "Studier", true);
//
//        System.out.println("*****TESTING EQUALS AND HASHCODE METHOD IN STUDENT CLASS");
//        Set<Student> studentSet = new HashSet<>();
//        Student equiv1 = new Student(123, "Sam", "Studier", true);
//        Student equiv2 = new Student(Integer.valueOf(123), new String("Sam"), new String("Studier"), Boolean.valueOf(true));
//        System.out.println("s1 and equiv1 equivalent \ttrue: " + s1.equals(equiv1));
//        System.out.println("s1 and equiv2 equivalent \ttrue: " + s1.equals(equiv2));
//        System.out.println("Same hashCode test1 \t" + s1.hashCode() + ": " + equiv1.hashCode());
//        System.out.println("Same hashCode test2 \t" + s1.hashCode() + ": " + equiv2.hashCode());
//        System.out.println("Add s1 \t\ttrue:  " + studentSet.add(s1));
//        System.out.println("Add s1 again \tfalse: " + studentSet.add(s1));
//        System.out.println("Add equiv  \tfalse: " + studentSet.add(equiv1));
//        System.out.println("Add equiv2 \tfalse: " + studentSet.add(equiv2));

        System.out.println("\n*****TESTING ADD TO VOTER HASHTABLE");
        Voter v1 = new Voter(912, "Delta Dem");
        Voter v2 = new Voter(670, "Rita Rep");
        Voter v3 = new Voter(381, "Ida Inde");
        Voter v4 = new Voter(497, "Greta Green");
        Voter v5 = new Voter(301, "Liz Libert");
        Voter v6 = new Voter(541, "Ursula Undec");

        Voter[] theVoters = {v1, v2, v3, v4, v5, v6};

        int tableSize = 5;
        VoterHashTableSeparateChaining voterTable = new VoterHashTableSeparateChaining(tableSize);
        for (Voter v : theVoters) {
            System.out.println("Added " + v.getName() + "  \ttrue: " + voterTable.addVoter(v));
        }
        System.out.println("\nFor reference, check where the location of each student should be. Then compare to your table.");
        System.out.println("The voters should be in these positions when the table is printed:");
        for (Voter v : theVoters) {
            System.out.println(v.getName() + " goes in\t" + voterTable.getHashLocation(v.getId()));
        }
        System.out.println();
        voterTable.printTable();
        System.out.println();

        /* // UNCOMMENT IF COMPLETING THE EXTRA CREDIT 
		System.out.println("\n*****TESTING EXTRA CREDIT- NO ADDING DUPLICATES");		
		System.out.println("Added Delta Dem again \tfalse: " + voterTable.addVoter(v1));
		System.out.println("Added Delta Dem equiv \tfalse: " + voterTable.addVoter(new Voter(912, "Delta Dem")));
		System.out.println("Added Delta Dem equiv \tfalse: " + voterTable.addVoter(new Voter(Integer.valueOf(912), new String("Delta Dem"))));
		System.out.println("Added Ursula Undec again \tfalse: " + voterTable.addVoter(v6));
		System.out.println("Added Ursula Undec equiv \tfalse: " + voterTable.addVoter(new Voter(541, "Ursula Undec")));
		System.out.println("Added Ursula Undec equiv \tfalse: " + voterTable.addVoter(new Voter(Integer.valueOf(541), new String("Ursula Undec"))));
         */
        System.out.println("\n*****TESTING RETRIEVE FROM");
        System.out.println("Retreived Delta Dem \t: " + voterTable.getVoter(v1.getId()));
        System.out.println("Retreived Rita Rep \t: " + voterTable.getVoter(v2.getId()));
        System.out.println("Retreived Ida Inde \t: " + voterTable.getVoter(v3.getId()));
        System.out.println("Retreived Greta Green \t: " + voterTable.getVoter(v4.getId()));
        System.out.println("Retreived Liz Libert \t: " + voterTable.getVoter(v5.getId()));
        System.out.println("Retreived Ursula Undec \t: " + voterTable.getVoter(v6.getId()));
        Voter v7 = new Voter(412, "Nancy NotAVoter");
        System.out.println("Retrieved Nancy NotAVoter? should be null: " + voterTable.getVoter(v7.getId()));

    }
}
