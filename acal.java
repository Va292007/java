class acal extends cal{
int mult(int a , int b)
    {
        return a * b;
    }
    
    int div(int a , int b)
    {
        return a / b;
    }

    public static void main(String args[])
    {
        acal c1 = new acal();
        
        System.out.println( c1.add(1, 2) );
        System.out.println( c1.sub(1, 2) );
        System.out.println( c1.mult(1, 2) );
        System.out.println( c1.div(1, 2) );
    }
}