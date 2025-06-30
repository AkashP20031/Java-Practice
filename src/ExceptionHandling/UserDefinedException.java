package ExceptionHandling;

class lowBalanceException extends Exception
{
    @Override
    public String toString()
    {
        return "Balance not less than 5000";
    }
}

public class UserDefinedException {
    public static void main(String[] args) throws lowBalanceException {
        int Balance = 500;
        try {
            if(Balance>=5000)
            {
                System.out.println("sufficient balance");
            }
            else
            {
                throw new lowBalanceException();
            }
        }catch (lowBalanceException e)
        {
            System.out.println(e);
        }


    }
}
