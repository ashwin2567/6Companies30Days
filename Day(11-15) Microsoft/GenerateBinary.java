class solve{
    static ArrayList<String> generate(int N)
    {
        ArrayList<String> list = new ArrayList<>();
        list.add("1");
        int count =0;
        while(count +1 < N)
        {
            String s=list.get(count);
            list.add(s + "0");
            if(list.size() == N)
            break;
            list.add(s + "1");
            if(list.size() == N)
            break;
            count= count+1;
        }
        return list;
    }
}
