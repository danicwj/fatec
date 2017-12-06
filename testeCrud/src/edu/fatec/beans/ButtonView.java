package edu.fatec.beans;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
 
@ManagedBean
public class ButtonView {
     
    public void buttonAction(ActionEvent actionEvent) {
        addMessage("Em Manuten�ao");
    }
    public void save(ActionEvent actionEvent) {
        addMessage("Blog em constru��o");
    }
    
    public void somos(ActionEvent actionEvent) {
        addMessage("Somos um e-marketplace que tem como objetivo fornecer solu��es tecnologicas  e inovadoras para facilitar o dia a dia de empresas prestadoras de servi�os do segmento Pet e das pessoas que possuem Pets.");
    }
    
    public void Poli(ActionEvent actionEvent) {
        addMessage("Ao cadastrar-se no SITE/APLICATIVO e/ou navegar pelo SITE/APLICATIVO, o usu�rio e/ou o visitante consente expressa ou tacitamente a utiliza��o de suas informa��es pessoais e demais dados, de acordo com a presente Pol�tica de Privacidade.");
    }

    
    public void termo(ActionEvent actionEvent) {
        addMessage("Qualquer pessoa f�sica interessada em agendar servi�os ou adquirir produtos (�CLIENTE�) ou qualquer pessoa jur�dica interessada em divulgar e oferecer seus servi�os, produtos e permitir o agendamento de hor�rios via internet (�ESTABELECIMENTO�), que pretenda utilizar os servi�os da Pet Booking, dever� aceitar o presente Termos de Uso e todas as demais pol�ticas e princ�pios que os regem o uso do SITE e os APLICATIVOS e realizar seu cadastramento como USU�RIO.");
    }
    public void duvidas(ActionEvent actionEvent) {
        addMessage("Tem mais d�vidas? Procure-nos nas redes sociais");
    }
    
    public void fale(ActionEvent actionEvent) {
        addMessage("Fale conosco!"
        		+ " Email: EPET@XXXXXX.XXX");
    }
    public void busca(ActionEvent actionEvent) {
        addMessage("Busca nao rertornou resultados");
    }
    
    
    
    public void addMessage(String summary) {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary,  null);
        FacesContext.getCurrentInstance().addMessage(null, message);
    }

}
