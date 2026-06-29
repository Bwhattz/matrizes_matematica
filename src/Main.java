public class Main {
    public static void main(String[] args) {

        int[][] matrizes = {

                {2,2,2,2},
                {2,2,2,2}
        };

        System.out.println("{");

        for(int i = 0;i < matrizes.length; i++) {
            System.out.print("{");

            for(int j = 0;j < matrizes[i].length; j++) {
                matrizes[i][j] += 10;
                System.out.print(matrizes[i][j]);

                if(j < matrizes[i].length - 1) {
                    System.out.print(",");
                }
            }

            if(i < matrizes.length - 1) {
                System.out.println("},");
            } else {
                System.out.print("}");
            }
        }

        System.out.println(" }");
    }
}