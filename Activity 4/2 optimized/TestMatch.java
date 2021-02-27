package com.AV.AbsAndInterface;

public class TestMatch extends Match {

	@Override
	float calculateRunRate() {
		
		float reqRunrate;
		reqRunrate = (float)(getTarget()-getCurrentScore())/(float)(90-(getCurrentOver()));
		// TODO Auto-generated method stub
		System.out.println(getTarget());
		System.out.println(getCurrentScore());
		
		
	
		return  reqRunrate;
	}

	@Override
	int calculateBalls() {
		// TODO Auto-generated method stub
		int co= getCurrentOver();
		int balls = co*6;
		//System.out.println("Need "+(getTarget()-getCurrentScore())+" runs in "+((540-(getCurrentOver()*6)))) ;
		return balls;
	}

	@Override
	void display(float reqRunrate, int balls) {
		
		System.out.println("Need "+(getTarget()-getCurrentScore())+" runs in "+((540-(getCurrentOver()*6)))) ;
		System.out.println("Required runrate is : " +reqRunrate);
		// TODO Auto-generated method stub
		
	}

}
