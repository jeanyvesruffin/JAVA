import java.util.List;

// Lorsque l'on manipule plusieurs interface qui ont la mm structure mais manipulant des type
// differents. Il est pratique de cr�er une interface g�n�rique qui prend en parametres
// les types manipul�s afin d'eviter la duplication des interface

// Interface Generic
// T: type d'objet
// U: Type de l'id
public interface IMetier<T, U> {
	public T save(T objet);
	public List<T> getAll();
	public T findOne(U id);
	public void update(T objet);
	public void delete(U id);

}
