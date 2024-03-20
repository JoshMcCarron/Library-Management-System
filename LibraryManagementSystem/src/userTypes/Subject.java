package userTypes;

public interface Subject {
	void addObserver(int facultyId) throws Exception;
	//void removeObserver(Observer observer);
	void notifyObserver(String newEdition);
}
