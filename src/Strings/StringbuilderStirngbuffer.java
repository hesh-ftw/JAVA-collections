package Strings;

public class StringbuilderStirngbuffer {
    public static void main(String[] args) {

        long StartTime= System.currentTimeMillis();

    //stirng builder
        StringBuilder builder = new StringBuilder("hello ");
//        builder.append("world");
//        System.out.println(builder);
        for(int i=0; i<100; i++){
            builder.append("world");
        }
        System.out.println("time takes to String builder to run = "+ (System.currentTimeMillis()-StartTime) );


    //String buffer
        StringBuffer buffer = new StringBuffer("hello ");
//        buffer.append("world");
//        System.out.println(buffer);
        for(int i=0; i<100; i++){
            buffer.append("world");
        }
        System.out.println("time takes to String buffer to run = "+ (System.currentTimeMillis()-StartTime) );
    }
}
