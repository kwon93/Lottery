import java.util.HashSet;
import java.util.Set;

public class Jebi {
    private Set<Integer> randomList = new HashSet<>();
    public int makeRandomNum(){
        while (true){
            int d = (int)((Math.random() *10000)%5)+1;
            if(!randomList.contains(d)){
                randomList.add(d);
                return d;
            }
        }
    }

    public void jebiResult(StudyMember studyMember){
        int result = makeRandomNum();
        if(result == 5){
            System.out.println("발표 준비 5분 전");
        }else {
            System.out.println("통과~");
        }
    }
}
