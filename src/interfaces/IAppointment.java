package interfaces;

import java.rmi.RemoteException;
import java.time.LocalDateTime;

public interface IAppointment {

	public void book_appointment(IStudent student) throws RemoteException;
	
	// ver melhor esta fun��o
	public void cancel_appointment() throws RemoteException;
	
	public LocalDateTime getInitial_time() throws RemoteException;
}
