package es.hecnabae.pf;

import es.hecnabae.pf.models.Ingrediente;
import es.hecnabae.pf.models.Receta;
import org.primefaces.event.CellEditEvent;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@ManagedBean
@SessionScoped
public class Index implements Serializable {
    private String holaMundo = "Hola Mundo";
    List<Ingrediente> ingredientes;
    Receta receta;

    public String getHolaMundo() {
        return holaMundo;
    }

    public void setHolaMundo(String holaMundo) {
        this.holaMundo = holaMundo;
    }

    public List<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(List<Ingrediente> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public Receta getReceta() {
        return receta;
    }

    public void setReceta(Receta receta) {
        this.receta = receta;
    }

    @PostConstruct
    public void init() {
        mockReceta();
    }

    public void onCellEdit(CellEditEvent event) {
        FacesContext context = FacesContext.getCurrentInstance();
        Ingrediente entity = context.getApplication().evaluateExpressionGet(context, "#{ingrediente}", Ingrediente.class);
        int ingIndex = this.ingredientes.indexOf(entity);
        Ingrediente ingrediente = (Ingrediente) event.getNewValue();
        this.ingredientes.set(ingIndex, ingrediente);
    }

    private void mockReceta() {
        Ingrediente pan = new Ingrediente("pan", 100.0, 50.0);
        Ingrediente tomate = new Ingrediente("tomate", 50.0, 25.0);
        Ingrediente queso = new Ingrediente("queso", 50.0, 25.0);

        this.ingredientes = new ArrayList<>();
        ingredientes.add(pan);
        ingredientes.add(tomate);
        ingredientes.add(queso);
        this.receta = new Receta("Tostas tomate y queso", 200.0, ingredientes);
    }
}
