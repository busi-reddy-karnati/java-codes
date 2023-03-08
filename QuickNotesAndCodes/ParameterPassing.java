class ParameterPassing{
    public static void main(String[] args) {
        SomeClass sample1 = new SomeClass(1);
        ParameterPassing parameterPassing = new ParameterPassing();
        SomeClass sample2 = parameterPassing.changeClass(sample1);
        System.out.println("Sample1 val: "+sample1.getVal());
        System.out.println("Sample2 val: "+sample2.getVal());
    }
    public SomeClass changeClass(SomeClass sample){
        sample.setVal(20);
        return sample;
    }
}


class SomeClass{
    private int val;
    SomeClass(int val){
        this.val = val;
    }
    public void setVal(int val){
        this.val = val;
    }
    public int getVal(){
        return this.val;
    }
}