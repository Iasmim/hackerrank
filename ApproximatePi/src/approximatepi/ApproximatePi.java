package approximatepi;

class ApproximatePi {

    public static double calcpi(double[][] pts) {

        int size = pts.length;
        int successCount = 0;

            for (int i = 0; i < size; i++) {
                double x = pts[i][0];
                double y = pts[i][1];

                if ((Math.pow(x, 2) + Math.pow(y, 2)) <= 1) {
                    successCount++;
                }
            }

        return (double) (4 * successCount) / size;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        
        double[][] rands = new double[100000][2];
        for (int i = 0; i < rands.length; i++) {
            rands[i][0] = Math.random();//x
            //System.out.println(rands[i][0]);
            rands[i][1] = Math.random();//y
            //System.out.println(rands[i][1]);
        }
        
        System.out.println(ApproximatePi.calcpi(rands));
    }

}
