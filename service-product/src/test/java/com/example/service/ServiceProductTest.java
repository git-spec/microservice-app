package com.example.service;

import java.math.BigDecimal;
import java.util.List;

import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.example.model.Category;
import com.example.model.Currency;
import com.example.model.Dimension;
import com.example.model.Family;
import com.example.model.Group;
import com.example.model.Images;
import com.example.model.Measure;
import com.example.model.Product;
import com.example.model.ProductFeatures;
import com.example.model.Unit;
import com.example.repository.RepositoryProduct;


@ExtendWith(MockitoExtension.class)
public class ServiceProductTest {
    @Mock
    private RepositoryProduct repoProduct;
    @InjectMocks
    private ServiceProduct serviceProduct;

    Measure width1 = new Measure(
                                    49,
                                    Unit.CM
                                );
    Measure length1 = new Measure(
                                    45,
                                    Unit.CM
                                );
    Measure height1 = new Measure(
                                    78,
                                    Unit.CM
                                );
    Measure width2 = new Measure(
                                    45.5,
                                    Unit.CM
                                );
    Measure length2 = new Measure(
                                    55,
                                    Unit.CM
                                );
    Measure height2 = new Measure(
                                    81,
                                    Unit.CM
                                );
    Measure width3 = new Measure(
                                    57,
                                    Unit.CM
                                );
    Measure length3 = new Measure(
                                    56,
                                    Unit.CM
                                );
    Measure height3 = new Measure(
                                    50,
                                    Unit.CM
                                );
    ProductFeatures feat1 = new ProductFeatures(
                        new Dimension(width1, length1, height1),
                        new Measure(6, Unit.KG),
                        List.of("oak", "ash"),
                        List.of("oak", "ash", "black")
                    );
    ProductFeatures feat2 = new ProductFeatures(
                        new Dimension(width2, length2, height2),
                        new Measure(4, Unit.KG),
                        List.of("hemp", "steel"),
                        List.of("hemp", "black")
                    );
    ProductFeatures feat3 = new ProductFeatures(
                        new Dimension(width3, length3, height3),
                        new Measure(9.6, Unit.KG),
                        List.of("metal"),
                        List.of("rust", "sand")
                    );
    Product prod1 = 
            Product.builder()
                .id("1536716")
                .number("1990")
                .name("Lara Chair")
                .manufacturer("Erol")
                .category(Category.FURNITURE)
                .group(Group.SEATING)
                .family(Family.CHAIR)
                .features(feat1)
                .info("Crafted from solid Ash timber.")
                .description("The Lara chair is made from solid ash and has clean elegant lines. Boasting a steam-bent backrest, crafted details and shaped solid wood seat makes this chair a perfect pairing for any dining setting or just as an occasional chair. The chair is available in a selection of wood finishes, and is available with an upholstered seat, with a choice of fabric from the ercol collection.")
                .images(new Images(
                        List.of("/small/lara/Lara--1990--chair--cutoutAngle-2--Ash--CM.jpg"),
                        List.of("http://imag)e2.test"),
                        List.of("/large/lara/Lara--1990--chair--cutoutAngle-2--Ash--)M.jpg")
                    )
                )
                .price(BigDecimal.valueOf(370))
                .currency(Currency.GBP)
                .build();
    Product prod2 = 
            Product.builder()
                .id("1536718")
                .number("HEMP-FI10")
                .name("Hemp Fine")
                .manufacturer("Vepa")
                .category(Category.FURNITURE)
                .group(Group.SEATING)
                .family(Family.CHAIR)
                .features(feat2)
                .info("Ein Stuhl mit Sitzschale aus Hanf auf Metallgestell, biologisch abbaubar.")
                .description("Mit Hemp Fine sind wir weltweit die Ersten, die eine Stuhlkollektion mit einer Sitzschale aus einem nachwachsenden Rohstoff auf den Markt bringen. Die verwendeten Materialien Hanf und Harz sind beide zu 100 % pflanzlichen Ursprungs und recyclingfähig. Etwas völlig Neues.")
                .images(new Images(
                        List.of("/small/lara/Lara--1990--chair--cutoutAngle-2--Ash--CM.jpg"),
                        List.of("http://imag)e2.test"),
                        List.of("/large/lara/Lara--1990--chair--cutoutAngle-2--Ash--)M.jpg")
                    )
                )
                .price(BigDecimal.valueOf(364))
                .currency(Currency.EUR)
                .build();
    Product prod3 = 
            Product.builder()
                .id("1536720")
                .number("50")
                .name("Olio 50")
                .manufacturer("Montis")
                .category(Category.FURNITURE)
                .group(Group.TABLE)
                .family(Family.SIDE_TABLE)
                .features(feat3)
                .info("Höhen verstellbarer Beistelltisch, gefertigt aus Metallresten.")
                .description("Mit dem Design und der Entwicklung der OLIO Beistelltische ermöglichen wir die Nutzung des Abfallstroms von unserem Zulieferer von Metallrahmen, die wir für unsere verschiedenen Stühle und Sessel verwenden.")
                .images(new Images(
                        List.of(""),
                        List.of(""),
                        List.of("/large/Hemp_Fine/Hemp-Fine-zijkant_DSC5841-2.jpg", "/large/Hemp_Fine/Hemp-Fine-met-armlegger-zijkant_DSC5859.jpg", "/large/Hemp_Fine/Hemp-Fine_DSC9116_1.jpg")
                    )
                )
                .price(BigDecimal.valueOf(356))
                .currency(Currency.EUR)
                .build();
}
