public class SquareEquation {
        private double[] multipliers = new double[3];
        public SquareEquation (double a, double b, double c)
        {
            multipliers[0] = a;
            multipliers[1] = b;
            multipliers[2] = c;
        }
        public double[] getRoots()
        {
            double discriminant = multipliers[1]*multipliers[1] - 4*multipliers[0]*multipliers[2];
            if (Double.compare(discriminant, 0) < 0)
            {
                throw new IllegalArgumentException("корней нет");
            }
            if(Double.compare(discriminant, 0) == 0)
            {
                double[] arr = new double[1];
                arr[0] = -multipliers[1] / (2*multipliers[0]);
                return arr;
            }
            double[] arr = new double[2];
            arr[0] = (-multipliers[1] + Math.sqrt(discriminant)) / (2*multipliers[0]);
            arr[1] = (-multipliers[1] - Math.sqrt(discriminant)) / (2*multipliers[0]);
            return arr;
        }
}
