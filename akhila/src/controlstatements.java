public class controlstatements {
    int age=18;
    
    void ifs()
    {
        if(age>=18){
            System.out.println("u r eligible to vote");
        }
        if(age<18){
            System.out.println("u r not eligible to vote");
        }
    }
    
    
    void ifelses()
    {
        if(age>=18){
            System.out.println("u r eligible to vote ");
        }
        else{
            System.out.println("u r not eligible to vote");
        }
    }
    
    
    void if_elseif_else()
    {
        if(age>18)
        {
            System.out.println("u r eligible to vote");
        }
        else if(age==18)
        {
            System.out.println("u r eligible to vote");
        }
        else{
            System.out.println("u r not eligible to vote");
        }
    }
        
    
    void nestedif()
    {
           if(age>=18)
        {
            if(age==18)
            {
                System.out.println("u r eligible to vote");
            }
        }
    }
    
    
    void switchs()
    {
      int n=2;
      System.out.println("switch statements");
      switch(n) 
      {
        case 1:
        System.out.println("monday");
        break;
        case 2 :
        System.out.println("tuesday");
        break;
        case 3:
        System.out.println("wednesday");
        break;
        case 4:
        System.out.println("thursday");
        break;
        case 5:
        System.out.println("friday");
        break;
        case 6:
        System.out.println("saturday");
        break;
        case 7:
        System.out.println("sunday");
        break;
      } 
    }
    
    
    void forloop()
    {
        int a=1;
        int n=5;
        int i;
        for(i=1;i<n;i++)
        {
            for(int j=1;j<2;j++)
            {
                //System.out.print(a+" ");
                continue;
            }
            System.out.print(a+" ");

            System.out.println(" ");
        }
    }
    void nestedforloop()
    {
        for(int i=1;i<5;i++)
        {
            for(int j=1;j<5;j++)
            {
                System.out.println(i+" "+j);
            }
        } 
    }
    
    
    void foreach()
    {
        int arr[]={11,12,14,15,14};
        for (int i : arr) {
            //System.out.println(arr);
            System.out.println(i);
        }
        
    }
    
    
    void labeledfor()
    {
        
        for(int i=1;i<=3;i++)
        {
            bb: 
            for(int j=1;j<=3;j++){
                if(i==3&&j==3){
                break bb;
                }
                System.out.println(i+" "+j);
            }
        }
    }
    
    void whileloop()
    {
        int i=1;
        while(i<=2)
        {
            System.out.println("u r eligible");
            i++;
            //we have to inctrement i value here else we get infinite iterations
        }
       
    }
    void dowhileloop()
    {
        int i=1;
        do{
            System.out.println(i);
        }while(i>2);
    }
    public static void main(String[] args) {
        new controlstatements().ifs();
        System.out.println("==========");
        new controlstatements().ifelses();
        System.out.println("==========");
        new controlstatements().if_elseif_else();
        System.out.println("==========");
        new controlstatements().nestedif();
        System.out.println("==========");
        new controlstatements().switchs();
        System.out.println("==========");
        new controlstatements().forloop();
        System.out.println("==========");
        new controlstatements().nestedforloop();
        System.out.println("==========");
        new controlstatements().foreach();
        System.out.println("==========");
        new controlstatements().labeledfor();
        System.out.println("==========");
        new controlstatements().whileloop();
        System.out.println("==========");
        new controlstatements().dowhileloop();
    }
    
}
