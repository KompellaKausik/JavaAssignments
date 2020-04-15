package Assignment6;

class constructorChaining {
    public constructorChaining(int argument1,int argument2){
        this(1,2,3);
    }
    public constructorChaining(int argument1,int argument2,int argument3){
        System.out.println(argument1+" "+argument2+" "+argument3);
    }
    public constructorChaining(String str){
        System.out.println(str);
    }

    public static void main(String[] args){
        constructorChaining constructor[]=new constructorChaining[2];
        constructor[0]=new constructorChaining(7,14);
        constructor[1]=new constructorChaining("hello world");




    }
}