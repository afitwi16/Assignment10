public class StandardDivation {

        public static void main(String args[])
        {
            double[] input={10.00,15.00,20.00,25.00, 12.00};
            double n=5,sum=0,mean;
            for(int i=0;i<n;i++)
            {
                sum=sum+input[i];
            }
            mean=sum/n;
            System.out.println("Mean :"+mean);
            sum=0;
            for(int i=0;i<n;i++)
            {
                sum+=Math.pow((input[i]-mean),2);

            }
            mean=sum/(n-1);
            double deviation=Math.sqrt(mean);
            System.out.println("standard deviation :"+deviation);

        }
    }

