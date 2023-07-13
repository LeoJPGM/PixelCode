package com.example.application.views.principal;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouteAlias;
import pagina.base.PaginaBase;


@PageTitle("Principal")
@Route(value = "Principal")
@RouteAlias(value = "")
public class PrincipalView extends PaginaBase {
    public PrincipalView() {
        PaginaPrincipal();
    }
    private void PaginaPrincipal() {
        //Contenedores
        VerticalLayout contenedorDeInformacion = new VerticalLayout();
        VerticalLayout contenedorBase = new VerticalLayout();
        HorizontalLayout contenedorColorBase = new HorizontalLayout();

        //Primer Contenedor (Solo color)
        VerticalLayout contenedor1 = new VerticalLayout();
        contenedor1.getStyle().set("background-color", "#e27b7b");
        contenedorColorBase.add(contenedor1);
        contenedorColorBase.setWidthFull();

        //Contenedor de informacion
        Span info = new Span("Cualquier persona con cualquier nivel de habilidad puede programar");;
        info.getStyle().set("color", "black");
        info.getStyle().set("font-weight", "bold");
        info.getStyle().set("font-size", "28px");

        Span info2 = new Span("PixelCode es una plataforma gratuita para aprender a programar en línea de una manera practica y sencilla.");
        Image imagen1 = new Image("images/Imagen1.gif", "Imagen");
        imagen1.setWidth("60%");

        Span info3 = new Span("Creación y programación");
        info3.getStyle().set("color", "black");
        info3.getStyle().set("font-weight", "bold");
        info3.getStyle().set("font-size", "28px");

        Span info4 = new Span("Aprende diveros lenguajes de programación como C, C#, Java, entre otros.");
        Image imagen2 = new Image("images/Imagen2.gif", "Imagen2");
        imagen2.setWidth("60%");

        Span info5 = new Span("Primeros pasos");
        info5.getStyle().set("color", "black");
        info5.getStyle().set("font-weight", "bold");
        info5.getStyle().set("font-size", "28px");

        Span info6 = new Span("¿Listo para empezar a crear y programar? Descubre lo fácil que es empezar a utilizar PixelCode.");
        Button empezar = new Button("Empezar aquí", buttonClickEvent -> {getUI().ifPresent(ui -> {ui.navigate("primeros-pasos");});});



        //Elementos de contenedor
        contenedorDeInformacion.add(info, info2, imagen1, info3, info4, imagen2, info5, info6, empezar);
        contenedorDeInformacion.setAlignItems(FlexComponent.Alignment.CENTER);
        contenedorBase.add(contenedorColorBase, contenedorDeInformacion);

        //Encargado de imprimir todo
        setContent(contenedorBase);

    }
}


