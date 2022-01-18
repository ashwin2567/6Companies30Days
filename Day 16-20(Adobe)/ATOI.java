class Solution
{
    int atoi(String str) {
        int ans=0, i=0;
        boolean flag=false;
        if(str.charAt(0)=='-')
        {
            flag=true;
            i++;
        }
	while(i<str.length())
	{
	    int temp =str.charAt(i) - '0';
	    if(temp>=0 && temp <=9)
	    {
	        ans= ans*10 + temp;
	    }
	    else
	    {
	        ans=-1;
	        break;
	    }
	    i++;
	}
	if(flag && ans!=-1)
	return ans * -1;
	else
	return ans;
    }
}
