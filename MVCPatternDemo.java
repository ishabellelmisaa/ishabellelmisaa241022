public class MVCPatternDemo {
    public static void main(String[] args) { 

	Hewan model = retriveHewanFromDatabase(); 

	//Create a view : to write student details on console 
	HewanView view = new HewanView(); 
	Hewancontroller Controller = new Hewancontroller(model, view); 	
        Controller.updateView(); 

	//update model data 
	Controller.setHewanName("Kucing"); 
	Controller.updateView(); 
	} 

	private static Hewan retriveHewanFromDatabase(){ 
	Hewan hewan = new Hewan(); 
	hewan.setName("Kelinci"); 
	hewan.setJenis("Hewan Di Darat"); 
	return hewan; 
	} 
}
