import java.util.ArrayList;

public class Member extends Person {
    private Boolean isBasic;

    public Member(){

    }

    public Member(String name, String cpr, Boolean isBasic) {
        super(name, cpr);
        this.isBasic = isBasic;
    }


    public static void print(){
        ArrayList<Member> mList = new ArrayList<>();
        Member m1 = new Member("Alan", "150853-1451", false);
        mList.add(m1);
        Member m2 = new Member("Tove", "210200-5465", true);
        mList.add(m2);
        Member m3 = new Member("Josuke", "151196-4564", false);
        mList.add(m3);
        Member m4 = new Member("Rasmus", "030482-9819", true);
        mList.add(m4);

        HelperClass.Layout("Name", "CPR", "Type", "Fee");
        HelperClass.stars();
        for(Member m : mList){
            String fee = Integer.toString(m.getMonthlyFee());
            HelperClass.Layout(m.getName(), m.getCpr(), m.getMemberType(), fee);
        }
        HelperClass.bars();
    }
    public String toString(){
        return getName() + "\t" + getCpr() + "\t \t" + getMemberType() + "\t" + getMonthlyFee();
    }
    public String getMemberType(){
        if(isBasic){
            return "Basic";
        }else{
            return "Full";
        }
    }

    public int getMonthlyFee(){
        if(isBasic){
            return 199;
        }else{
            return 299;
        }
    }

    public Boolean getBasic() {
        return isBasic;
    }
}
