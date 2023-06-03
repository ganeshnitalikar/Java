class GoogleWeather{
	String location = "Pune";
	float temperature  = 32.0f ;

	void showWeather(){
		System.out.println("Weather Of "+location + " :" + temperature);
	}
	void checkWeather(){
		String newLoc = "Mumbai";
		float newTemperature = 30.0f;
		System.out.println("Weather Of "+ newLoc+" is: " + newTemperature);
	}
}
class User{

	public static void main(String args[]){
		GoogleWeather obj = new GoogleWeather();
			
		System.out.println(obj.location);
		System.out.println(obj.temperature);

		obj.showWeather();
		obj.checkWeather();

	}
}
