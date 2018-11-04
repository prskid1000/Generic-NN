 class cneurn
{
	double out;
	double in[];
	int l;
	neurn n[];
	neurn ut;
	cneurn(double ini[])
	{
	int l=ini.length;
	in=new double[l];
	in=ini;
	n=new neurn[l];
	for(int i=0;i<l;i++)n[i]=new neurn(n);   
	ut=new neurn(n);
	
	}
}
