package test;

public class Test {
    private int num;
    private String data;

    public boolean equals(Object obj){
        if(this == obj)
            return true;
        if((obj == null) || (obj.getClass() != this.getClass()))
            return false;

        //执行到这里，说明obj 和 this 同类并且非null
        Test test = (Test) obj;
        return num == test.num && (data == test.data)||(data != null && data.equals(test.data));
    }

    public int hashCode(){
        //重写equals，也必须重写hashCode。具体后面介绍
        return 1;
    }
}

