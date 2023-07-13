package com.example.application.views.principal;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import pagina.base.PaginaBase;

@PageTitle("Primeros Pasos")
@Route(value = "primeros-pasos")

public class PrimerosPasosView extends PaginaBase {
    public PrimerosPasosView(){
        PaginaPrincipal();
    }
    public void PaginaPrincipal(){
        //Contenedores
        VerticalLayout contenedorBase = new VerticalLayout();
        HorizontalLayout contenedorColorBase = new HorizontalLayout();
        VerticalLayout contenedorDeTitulo = new VerticalLayout();
        VerticalLayout contenedorDeSubInfo = new VerticalLayout();
        HorizontalLayout contenedorBaseDeInfo = new HorizontalLayout();
        HorizontalLayout contenedorOpcionesBase = new HorizontalLayout();

        //Primer Contenedor (Solo color)
        VerticalLayout contenedor1 = new VerticalLayout();
        contenedor1.getStyle().set("background-color", "#f4d000");
        contenedorColorBase.add(contenedor1);
        contenedorColorBase.setWidthFull();

        //Contenedor de titulo
        Span info = new Span("Primeros pasos");
        info.getStyle().set("color", "black");
        info.getStyle().set("font-weight", "bold");
        info.getStyle().set("font-size", "28px");

        contenedorDeTitulo.add(info);
        contenedorDeTitulo.setAlignItems(FlexComponent.Alignment.CENTER);

        //Contenedor de informacion
        VerticalLayout contenedorInfo = new VerticalLayout();

        Span info2 = new Span("PixelCode es es fácil y sencillo");
        info2.getStyle().set("font-size", "24px");
        info2.getStyle().set("color", "black");
        info2.getStyle().set("font-weight", "bold");

        Span info3 = new Span("Todo lo que necesitas es un ordenador con conexión a Internet. No es necesario descargar ni instalar nada. PixelCode es gratuito y funciona en todos los navegadores y plataformas.");

        contenedorInfo.add(info2, info3);
        contenedorInfo.setJustifyContentMode(FlexComponent.JustifyContentMode.CENTER);

        contenedorInfo.getStyle().set("background-color", "#dae1f0");
        contenedorInfo.setWidth("100%");

        //Contenedor de imagen
        HorizontalLayout contenedorDeImagen = new HorizontalLayout();
        Image imagen1 = new Image("images/Imagen3.gif", "Imagen");
        imagen1.setWidth("100%");

        contenedorDeImagen.add(imagen1);
        contenedorBaseDeInfo.setSpacing(false);
        contenedorBaseDeInfo.add(contenedorInfo, contenedorDeImagen);

        //Contenedor subInfo
        Span info4 = new Span("Empieza a programar");
        info4.getStyle().set("color", "black");
        info4.getStyle().set("font-weight", "bold");
        info4.getStyle().set("font-size", "28px");

        Span info5 = new Span("Escoge entre los diversos lenguajes de programación que tenemos para ti.");

        contenedorDeSubInfo.add(info4, info5);
        contenedorDeSubInfo.setAlignItems(FlexComponent.Alignment.CENTER);

        //Contenedor de opciones
        VerticalLayout contenedorOpcion1 = new VerticalLayout();
        Icon flecha = new Icon(VaadinIcon.PLAY);
        Button empezar1 = new Button("Empezar", buttonClickEvent -> {getUI().ifPresent(ui -> {ui.navigate("lenguaje-c");});});

        empezar1.setIcon(flecha);
        empezar1.getStyle().set("background-color", "transparent");
        empezar1.getStyle().set("font-size", "15px");
        empezar1.getStyle().set("font-weight", "bold");
        empezar1.getStyle().set("color", "#1293e3");


        Span info6 = new Span("Aprender lenguaje en C");
        info6.getStyle().set("color", "black");
        info6.getStyle().set("font-weight", "bold");

        Span info7 = new Span("Nuestro tutorial de C cubre conceptos básicos, tipos de datos, matrices, punteros, sentencias condicionales, bucles, funciones, cadenas, estructuras, uniones y mucho más.");

        contenedorOpcion1.add(info6, info7, empezar1);
        contenedorOpcion1.setJustifyContentMode(FlexComponent.JustifyContentMode.CENTER);
        contenedorOpcion1.getStyle().set("background-color", "#81d8ff");
        contenedorOpcion1.setWidth("35%");

        VerticalLayout contenedorOpcion2 = new VerticalLayout();
        Icon flecha2 = new Icon(VaadinIcon.PLAY);
        Button empezar2 = new Button("Empezar");

        empezar2.setIcon(flecha2);
        empezar2.getStyle().set("background-color", "transparent");
        empezar2.getStyle().set("font-size", "15px");
        empezar2.getStyle().set("font-weight", "bold");
        empezar2.getStyle().set("color", "#48a73e");

        Span info8 = new Span("Aprender lenguaje en C#");
        info8.getStyle().set("color", "black");
        info8.getStyle().set("font-weight", "bold");

        Span info9 = new Span("¡Con nuestro tutorial interactivo de C#, aprenderá programación en C# sobre la marcha!");

        contenedorOpcion2.add(info8, info9, empezar2);
        contenedorOpcion2.setJustifyContentMode(FlexComponent.JustifyContentMode.CENTER);
        contenedorOpcion2.getStyle().set("background-color", "#b9dc7a");
        contenedorOpcion2.setWidth("30%");

        VerticalLayout contenedorOpcion3 = new VerticalLayout();
        Icon flecha3 = new Icon(VaadinIcon.PLAY);
        Button empezar3 = new Button("Empezar", buttonClickEvent -> {getUI().ifPresent(ui -> {ui.navigate("lenguaje-java");});});

        empezar3.setIcon(flecha3);
        empezar3.getStyle().set("background-color", "transparent");
        empezar3.getStyle().set("font-size", "15px");
        empezar3.getStyle().set("font-weight", "bold");
        empezar3.getStyle().set("color", "#d55771");

        Span info10 = new Span("Aprender lenguaje en Java");
        info10.getStyle().set("color", "black");
        info10.getStyle().set("font-weight", "bold");

        Span info11 = new Span("Este curso de Java simple y amigable para principiantes no requiere conocimientos previos de codificación. Aprenderá todo sobre los conceptos clave de Java y escribirá código claro y funcional desde su primera lección.");

        contenedorOpcion3.add(info10, info11, empezar3);
        contenedorOpcion3.setJustifyContentMode(FlexComponent.JustifyContentMode.CENTER);
        contenedorOpcion3.getStyle().set("background-color", "#ea8686");
        contenedorOpcion3.setWidth("35%");

        contenedorOpcionesBase.add(contenedorOpcion1, contenedorOpcion2, contenedorOpcion3);

        contenedorBase.add(contenedorColorBase, contenedorDeTitulo, contenedorBaseDeInfo, contenedorDeSubInfo, contenedorOpcionesBase);

        setContent(contenedorBase);
    }
}
