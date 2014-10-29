import java.util.*;

public class Arraystuff{
    private int[] a;
    Random rnd;

    public Arraystuff(int n){
	rnd = new Random();
	a = new int[n];
	for (int i=0; i<a.length; i++){
	    a[i] = 75+rnd.nextInt(76);
	}
    }

    public Arraystuff(){
	this(100);
    }

    public String toString(){
	String s = "";
	for (int i=0; i<a.length; i++){
	    s = s + a[i] + ", ";
	}
	return s;
    }

    public int find(int n){
	for (int i=0; i<a.length; i++){
	    if (a[i] == n){
		return i;
	    }
	}
	return -1;
    }

    public int maxVal(){
	int max = 0;
	for (int i=0; i<a.length; i++){
	    if (a[i] > max){
		max = a[i];
	    }
	} 
	return max;
    }


public int sum67(int[] nums) {
	boolean six = false;
	int l=nums.length;
	int c=0;
	for(int i=0; i<l; i++){
	    if(six){
		if(nums[i]==7) six = false;
	    }else{
		if(nums[i]==6){
		    six = true;
		}else{
		    c+=nums[i];
		}
	    }
	}
	return c;
    }
    public boolean more14(int[] nums) {
	int l = nums.length;
	int one = 0;
	int four = 0;
	for (int i=0; i<l; i++){
	    if (nums[i] == 1) one++;
	    if (nums[i] == 4) four++;
	}
	return one>four;
    }
    public int[] tenRun(int[] nums) {
	int c=1;
	int l = nums.length;
	for(int i=0; i<l; i++){
	    if(nums[i]%10==0){
		c=nums[i];
	    }else{
		if(c!=1) nums[i]=c;
	    }
	}
	return nums;
    }
    public boolean tripleUp(int[] nums) {
	int l = nums.length;
	if(l==0) return false;
	int c = nums[0];
	boolean second = false;
	for (int i=1; i<l; i++){
	    if(!second){
		if(nums[i]==c+1){
		    second=true;
		}else{
		    c=nums[i];
		}
	    }else{
		if(nums[i]==c+2){
		    return true;
		}else{
		    second=false;
		    c=nums[i];
		}
	    }
	}
	return false;

}