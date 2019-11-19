public class FinalUMUC {
    public static void main(String[] args) {
        TestAlgorithm testClass = new TestAlgorithm();

        System.out.println("Test cases");
        testClass.testExecute("E:\\School\\UMUC\\CMSC350_DataStructures&Analysis\\week8_DS&A\\pRaleyFinal\\graphTestAllConnected.txt");
        System.out.println("");
        testClass.testExecute("E:\\School\\UMUC\\CMSC350_DataStructures&Analysis\\week8_DS&A\\pRaleyFinal\\graphTestAllDisconnected.txt");
        System.out.println("");
        testClass.testExecute("E:\\School\\UMUC\\CMSC350_DataStructures&Analysis\\week8_DS&A\\pRaleyFinal\\graphTestSinglePath.txt");
        System.out.println("");
        testClass.testExecute("E:\\School\\UMUC\\CMSC350_DataStructures&Analysis\\week8_DS&A\\pRaleyFinal\\graphTestWeightedPath.txt");

        System.out.println("");
        System.out.println("");
        System.out.println("Graphs for assignment");
        testClass.testExecute("E:\\School\\UMUC\\CMSC350_DataStructures&Analysis\\week8_DS&A\\pRaleyFinal\\Graph1Data.txt");
        System.out.println("");
        testClass.testExecute("E:\\School\\UMUC\\CMSC350_DataStructures&Analysis\\week8_DS&A\\pRaleyFinal\\Graph2Data.txt");
        System.out.println("");
        testClass.testExecute("E:\\School\\UMUC\\CMSC350_DataStructures&Analysis\\week8_DS&A\\pRaleyFinal\\Graph3Data.txt");
        System.out.println("");
        testClass.testExecute("E:\\School\\UMUC\\CMSC350_DataStructures&Analysis\\week8_DS&A\\pRaleyFinal\\Graph4Data.txt");
    }
}
