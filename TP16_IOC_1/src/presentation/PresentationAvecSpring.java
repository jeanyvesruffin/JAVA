package presentation;

import org.springframework.context.support.ClassPathXmlApplicationContext;


import metier.IMetier;

public class PresentationAvecSpring {
	// 1er on importe les fichier necaissaire à Spring (version manuel copier/ coller )
	// + ajout ds le clsse path du projet
	// 2eme creer un fichier de configuration de Spring 
	public static void main(String[] args) {
		// on creer le fichier de configuration spring applicationContext.xml
		// on demande a spring de creer un objet daoImpl au demarrage de l'application
		// on injecte les dependances
		/* 	
			<bean id="d" class="dao.DaoImpl"></bean>
				<bean id="m" class="metier.MetierImpl">
					<property name="dao" ref="d"></property>
			</bean> 
		 */
		// on demande de spring de lire le fichier 
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext 
				(new String[] {"/applicationContext.xml"}); 
		// on demande à spring ("donne moi un objet metier)
		IMetier metier = (IMetier) context.getBean("metier");
		System.out.println(metier.calcul());
		
	}

}
