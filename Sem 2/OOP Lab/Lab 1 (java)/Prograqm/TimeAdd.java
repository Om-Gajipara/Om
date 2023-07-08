import java.util.Scanner;
class TimeAdd {
	public static void main(String[] args) {
		AddTime c1 =new AddTime(10,30,45);
		

		AddTime c2 =new add_time(10,20,30);
		c1.add_time(c2);
	}
}

class AddTime{
	int hour,minute,second;

	public AddTime(int hour, int minute, int second){
		this.hour=hour;
		this.minute=minute;
		this.second=second;
	}
	void add_time (Addtime t){
		this.second += t.second;
		if(this.second>=60){
			this.minute++;
			this.second-=60;
		}
		this.minute += t.minute;
		if(this.minute>=60){
			this.hour++;
			this.minute-=60;
		}
		this.hour += t.hour;
	}
}

