package com.example.application.views.principal;

import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import pagina.base.PaginaBase;
@PageTitle("Fundamentos")
@Route(value = "fundamentos-java")
public class FundamentosJava extends PaginaBase {
    public FundamentosJava(){
        PaginaPrincipal();
    }
    private void PaginaPrincipal() {
        //Contenedores
        VerticalLayout contenedorDeInformacion = new VerticalLayout();
        VerticalLayout contenedorBase = new VerticalLayout();
        HorizontalLayout contenedorColorBase = new HorizontalLayout();

        //Primer Contenedor (Solo color)
        VerticalLayout contenedor1 = new VerticalLayout();
        contenedor1.getStyle().set("background-color", "#ff6952");
        contenedorColorBase.add(contenedor1);
        contenedorColorBase.setWidthFull();

        //Contenedor de informacion
        Span info = new Span("Fundamentos de Java");;
        info.getStyle().set("color", "black");
        info.getStyle().set("font-weight", "bold");
        info.getStyle().set("font-size", "28px");

        Span info2 = new Span("Java es un lenguaje de programación popular y ampliamente utilizado. Es conocido por su portabilidad, ya que puede ejecutarse en diferentes plataformas, como Windows, macOS y Linux. Además, Java es un lenguaje orientado a objetos, lo que significa que se basa en la creación y manipulación de objetos para desarrollar aplicaciones.");
        Image imagen1 = new Image("images/Imagen5.gif", "Imagen");
        imagen1.setWidth("60%");

        Span info3 = new Span("Por donde puedo empezar?");
        info3.getStyle().set("color", "black");
        info3.getStyle().set("font-weight", "bold");
        info3.getStyle().set("font-size", "28px");

        Span info4 = new Span("Para empezar a programar en Java, necesitarás configurar tu entorno de desarrollo. Esto implica instalar el Kit de Desarrollo de Java (JDK) en tu máquina y configurar tu editor de código preferido. El JDK contiene las herramientas necesarias para compilar y ejecutar programas Java.");
        Image imagen2 = new Image("images/Imagen2.gif", "Imagen2");
        imagen2.setWidth("60%");

        Span info5 = new Span("Tipos de variables");
        info5.getStyle().set("color", "black");
        info5.getStyle().set("font-weight", "bold");
        info5.getStyle().set("font-size", "28px");

        Span info6 = new Span("Un concepto fundamental en Java son las variables, que son espacios de memoria reservados para almacenar datos. Puedes declarar variables utilizando un tipo de dato específico, como entero (int), cadena de texto (String), booleano (boolean), entre otros. Las variables te permiten almacenar y manipular información en tu programa.");



        //Elementos de contenedor
        contenedorDeInformacion.add(info, info2, imagen1, info3, info4, imagen2, info5, info6);
        contenedorDeInformacion.setAlignItems(FlexComponent.Alignment.CENTER);
        contenedorBase.add(contenedorColorBase, contenedorDeInformacion);

        //Encargado de imprimir todo
        setContent(contenedorBase);

    }
}
