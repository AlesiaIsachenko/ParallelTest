public class Main {

    public int [] sort(int [] massive){
        int [] sortmassive = massive;
        for (int i = 0 ; i< massive.length; i++){
            for (int j=i+1; j <massive.length; j ++){
                int change = 0;
                if (sortmassive[i]>sortmassive[j]){
                    change = sortmassive[j];
                    sortmassive[j] = sortmassive[i];
                    sortmassive[i]=change;
                }
            }
        }
        return sortmassive;
    }

    public int [] bubleSort(int [] massive){
        int [] sortmassive = massive;
        for (int i = massive.length-1 ; i >0; i--){
            for (int j=0; j <i; j ++){
                int change = 0;
                if (sortmassive[j]>sortmassive[j+1]){
                    change = sortmassive[j+1];
                    sortmassive[j+1] = sortmassive[j];
                    sortmassive[j]=change;
                }
            }
        }
        return sortmassive;
    }

    public void print (int [] massive){
        System.out.println("");
        for (int value: massive){
            System.out.print(value + " ");
        }
    }


    public static void main(String[] args) {
        Main main = new Main();
        int massive [] = {12, 4, 3, 5,0, 8, 7, 2, 10, 1, 11};
        main.print(massive);
        massive = main.bubleSort(massive);
        main.print(massive);

        int massive1 [] = {0, 4, 3, 5,0, 8, 7, 2, 10, 1, 11};
        main.print(massive1);
        massive1 = main.bubleSort(massive1);
        main.print(massive1);

        int massive2 [] = {12, 4, 3, 5,0, 8, 7, 2, 10, 1, 0};
        main.print(massive2);
        massive2 = main.bubleSort(massive2);
        main.print(massive2);

        int massive3 [] = {12, 4, 3, 15,0, 8, 7, 2, 10, 1, 11};
        main.print(massive3);
        massive3 = main.bubleSort(massive3);
        main.print(massive3);

        int massive4 [] = {12, 4, 3, 5,0, 8, 7, 2, 10, 1, 16};
        main.print(massive4);
        massive4 = main.bubleSort(massive4);
        main.print(massive4);

    }
}
