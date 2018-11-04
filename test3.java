public class test3
{
        public static void main(String args[])throws Exception
            {
                neurn in[]=new neurn[4];
                neurn hn[]=new neurn[2];
                neurn op=new neurn();
				neurn b1=new neurn();
				neurn b2=new neurn();
				b1.ff(0);
				b2.ff(0);
				for(int i=0;i<4;i++)
				{
					in[i]=new neurn();
					in[i].adn(b1);
					in[i].adn(b2);
					}
				for(int i=2;i<4;i++)
				{
					hn[0]=new neurn(in[i]);	
					hn[1]=new neurn(in[i-2]);		
				}
				Receptor rp=new Receptor();
				for(int k=0;k<=16;k++)
				{
					double e=0;
					for(int i=0;i<4;i++)
					{
						in[0].ff(rp.in4[i][0]);
						in[1].ff(rp.in4[i][1]);
						in[2].ff(rp.in4[i][2]);
						in[3].ff(rp.in4[i][3]);
						
						System.out.println(op.f);
						System.out.println(rp.d[i]+"= at "+i+" is "+op.fire());
						e=e+op.cerr(rp.d[i],0.03,0.01);
						System.out.println("e "+e);
					}
					e=e+op.cerr(e,0.03,0.01);
					System.out.println("error"+e);
				}
                }
}
