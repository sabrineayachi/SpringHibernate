
import java.util.List;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import persistance.Client;

import dao.ClientDao;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BeanFactory beanfactory = new ClassPathXmlApplicationContext("spring-hibernate.xml");
		ClientDao clientdao =  (ClientDao) beanfactory.getBean("clientDao");
		Client cl = (Client) beanfactory.getBean("idclient");
		//Client client = new Client();
		cl.setIdclient(789654);
		cl.setAdress("ab");
		cl.setNom("ay");
		cl.setPrenom("dd");
		cl.setTel(45);
		
		clientdao.ajouter(cl);;
		
        List <Client> list = clientdao.findClients();
        for(int i=0; i<list.size(); i++)
        {
        	System.out.println(i + "clients : " + list.get(i).getIdclient() ); }

	} }
        
        
        
	


