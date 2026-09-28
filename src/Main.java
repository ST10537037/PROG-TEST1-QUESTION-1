//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    int[][] sales = {{1000,2000,3000},{2000,3000,4000},{1500,1100,1200}};
    String[] city = {"CAPE TOWN","PORT ELIZABETH","PRETORIA"};
    String[] console = {"PS5","XBOX","SWITCH"};
    int total = sales[0][0];
    int maximum = sales[0][0];

    System.out.println("---------------------------------------------------------------------");
    System.out.println("GAMING CONSOLE REPORT");
    System.out.println("---------------------------------------------------------------------");

    System.out.printf("%-18s","");
    for (int consoles = 0;consoles < console.length; consoles++) {
        System.out.printf("%-8s", console[consoles]);
    }

    System.out.println();
    for (int cities = 0; cities <city.length; cities++) {
        System.out.printf("%-18s",city[cities]);
        for (int   = 0;  < sales[console].length; ++) {
            System.out.printf("%-8d", [][]);


            total += console[sales][cities];
            if (sales[][cities] > maximum) {
                maximum =sales[][cities];
            }


        }
        System.out.println();
    }
    System.out.println("******************************************************************");
    System.out.println("CONSOLE SALES TOTALS FOR EACH CITY");
    System.out.println("******************************************************************");
    System.out.println("CAPE TOWN" + total);
    System.out.println("CITY WITH THE MOST SALES" + maximum);
    System.out.println("******************************************************************");
}
