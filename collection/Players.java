package collection;

public class Players implements Comparable {
	String name;
	int score;
	float avg;
	Players(String name,int score,float avg){
		this.name=name;
		this.score=score;
		this.avg=avg;
	}
	public String toString() {
		return this.name+" "+this.score+" "+this.avg;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	@Override
	public int compareTo(Object o) {
		
		Players p1=(Players) o;
		System.out.println(p1);
		System.out.println(this.name);
		if(this.score>p1.score)
			return +101;
		else if(this.score<p1.score)
			return -1;
		return 0;
	}
}
