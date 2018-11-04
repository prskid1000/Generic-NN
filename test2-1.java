 class test2
{
    public static void main(String args[])throws Exception
    {
        neurn n[]=new neurn[2];
        neurn n2[]=new neurn[2];
        neurn n3=new neurn();
        n[0]=new neurn();
        n[1]=new neurn();
        n2[0]=new neurn(n);
        n2[1]=new neurn(n);
        n3=new neurn(n2);
       neurn n4=new neurn();
        n4.ff(1);
        n3.adn(n4);
        double  in[][]=new  double [4][2];
        double  d[]=new  double [4];
        d[0]=0;
        d[1]=1;
        d[2]=1;
        d[3]=0;
        in[0][0]=0;
        in[0][1]=0;
        in[1][0]=0;
        in[1][1]=1;
        in[2][0]=1;
        in[2][1]=0;
        in[3][0]=1;
        in[3][1]=1;
        double e=12000;
        while(e>10)
        {
            e--;
            for(int i=0;i<4;i++)
            {
          n[0].ff(in[i][0]);
          n[1].ff(in[i][1]);
          System.out.println(d[i]+"="+i+"="+n3.fire());
         e=e+n3.cerr(d[i],0.2,0.1);
          }
        }
    }
}
