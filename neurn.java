import java.io.*;
import java.util.*;
public class neurn
    {
        public double f=0,E=0.0;
		ArrayList w,dw,n;       
        //constructors
        //input
        neurn()
            {
                f=0;
                E=0;
                n=new ArrayList();
                w=new ArrayList();
                dw=new ArrayList();
            }
        //hidden and output neurn
        neurn(neurn n1[])
            {

                n=new ArrayList();
                w=new ArrayList();
                dw=new ArrayList();
                for(int i=0;i<n.length;i++)
                    {
                        this.n[i]=n[i];
                        w[i]=Math.random();
                        dw[i]=0;
                    }
            }
        //hidden and output neurn
        neurn(neurn n)
            {

                this.n=new neurn[1];
                this.w=new double[1];
                this.dw=new double[1];
                this.n[0]=n;
                w[0]=Math.random();
                dw[0]=0;

            }
        //input 
        public void ff(double f)
            {
                this.f=f;

            }
        //add a neuron
        public void adn(neurn a)
            {
                neurn n1[]=new neurn[n.length+1];
                double w1[]=new double[n.length+1];
                double dw1[]=new double[n.length+1];
                for(int i=0;i<n.length;i++)
                    {
                        n1[i]=n[i];  
                    }  
                n1[n.length]=a;
                dw1[n.length]=0;
                w1[n.length]=1;
                n=new neurn[n1.length];
                w=new double[n1.length];
                dw=new double[n1.length];
                for(int i=0;i<n1.length;i++)
                    {
                        n[i]=n1[i];  
                        w[i]=w1[i];
                        dw[i]=dw1[i];
                    }  
            }
        //remove a neuron
        public void rvn(int p)
            {
                if(p<=this.n.length)
                    {
                        neurn n1[]=new neurn[n.length-1];
                        double w1[]=new double[n.length-1];
                        double dw1[]=new double[n.length-1];
                        int k=0;
                        for(int j=0;j<this.n.length;j++)
                            {
                                if(p!=j)
                                    {
                                        n1[k]=this.n[j];
                                        dw1[k]=dw[j];
                                        w1[k]=w[j];
                                        k++;
                                    }

                            }
                        n=new neurn[n1.length];
                        w=new double[n1.length];
                        dw=new double[n1.length];
                        for(int i=0;i<n1.length;i++)
                            {
                                n[i]=n1[i];  
                            }  
                    }
            }
        //get final output from neuron
        public  double fire()
            {
                if(n!=null)
                    {
                        f=0; 
                        for(int i=0;i<n.length;i++)
                            {
                                    {
                                        f=f+n[i].fire()*w[i];
                                    }
                            }

                    }
                f=fx(f);

                return f;

            }
        //correct error with backpropogation 
        public double cerr(double e,double m,double l)
            {
                double d=(e-f)*f*(1-f);
                if(n!=null)
                    {
                        E=0;

                        for(int i=0;i<n.length;i++)

                            {
                                dw[i]=m*dw[i]+l*(n[i].f*d);                               
                                E=E+Math.pow(n[i].cerr(w[i]*d,m,l),2);
                                w[i]=w[i]+dw[i];                                
                            }
                    }
                else
                    {
                        E=Math.pow(d,2);
                    }
                return E;
            }
        //memorizing trianing
        public void mmrz()throws Exception
            {
                String txt="",p="";
                int i=0;
                String s="/sdcard/AppProjects/"+p+".txt";    
                File f=new File(s);
                if(f.exists()==false)f.createNewFile();
                FileReader fr=new FileReader(f);
                BufferedReader bf=new BufferedReader(fr);             
               while((txt=bf.readLine())!=null)
                    {                            
                       
                      w[i++]=Integer.parseInt(txt);                                                   
                    }
                bf.close();                                                   
               } 
        //recollecting memorized data
        public void rct()throws Exception
            {  
                String p="";
                int i=0;
                String s="/sdcard/AppProjects/"+p+".txt";                
                FileWriter fr=new FileWriter(s);
                BufferedWriter xp=new BufferedWriter(fr);
                PrintWriter bf=new PrintWriter(xp);
                while(true)
                    {                            
                  if(i==w.length)break;
                        bf.println(w[i++]);                                                   
                    }
                bf.close();                                                   
            }   
        //activation funtion
        private double fx(double x)
            {
                return 1/(1+Math.exp(-x)); 
            }
    }
