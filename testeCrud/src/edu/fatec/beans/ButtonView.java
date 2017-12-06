package edu.fatec.beans;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
 
@ManagedBean
public class ButtonView {
     
    public void buttonAction(ActionEvent actionEvent) {
        addMessage("Em Manutençao");
    }
    public void save(ActionEvent actionEvent) {
        addMessage("Blog em construção");
    }
    
    public void somos(ActionEvent actionEvent) {
        addMessage("Somos um e-marketplace que tem como objetivo fornecer soluções tecnologicas  e inovadoras para facilitar o dia a dia de empresas prestadoras de serviços do segmento Pet e das pessoas que possuem Pets.");
    }
    
    public void Poli(ActionEvent actionEvent) {
        addMessage("Ao cadastrar-se no SITE/APLICATIVO e/ou navegar pelo SITE/APLICATIVO, o usuário e/ou o visitante consente expressa ou tacitamente a utilização de suas informações pessoais e demais dados, de acordo com a presente Política de Privacidade.");
    }

    
    public void termo(ActionEvent actionEvent) {
        addMessage("Qualquer pessoa física interessada em agendar serviços ou adquirir produtos (“CLIENTE”) ou qualquer pessoa jurídica interessada em divulgar e oferecer seus serviços, produtos e permitir o agendamento de horários via internet (“ESTABELECIMENTO”), que pretenda utilizar os serviços da Pet Booking, deverá aceitar o presente Termos de Uso e todas as demais políticas e princípios que os regem o uso do SITE e os APLICATIVOS e realizar seu cadastramento como USUÁRIO.");
    }
    public void duvidas(ActionEvent actionEvent) {
        addMessage("Tem mais dúvidas? Procure-nos nas redes sociais");
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
