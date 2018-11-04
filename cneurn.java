public class cneurn
	{
		double out,lr,mr,d;
		double in[];
		int l;
		neurn n[];
		neurn ut;	
		cneurn(double ini[],double dt,double lt,double mt)
			{
				d=dt;
				lr=lt;
				mr=mt;
				int l=ini.length;
				in=new double[l];
				in=ini;
				n=new neurn[l];
				for(int i=0;i<l;i++)n[i]=new neurn(n);   
				ut=new neurn(n);
				double e=1.0;
				while(e>0)
				{
					ut.fire();
					e=ut.cerr(d,lr*e,mr*e);
				}
			}		
	}
