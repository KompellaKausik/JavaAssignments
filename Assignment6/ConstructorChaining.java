package Assignment6;

class ChainConstructor {
    public ChainConstructor(int argument1){
        this(14,44,5);
    }
    public ChainConstructor(int argument1,int argument2,int argument3){
        System.out.println(argument1+" "+argument2+" "+argument3);
    }
    public ChainConstructor(String str){
        System.out.println(str);
    }

    public static void main(String[] args){
        ChainConstructor constructor=new ChainConstructor(14);
        constructor = new ChainConstructor("this is kaushik");
    }
}