package com.example.animatedsplashscreen.Fragment
//yeh vala data fragment about search ke liye hai
object setData {

    fun SetFlower():List<FlowerData>{
        var FlowerList= mutableListOf<FlowerData>()
        FlowerList.add(
            FlowerData(
                1,
                "Rose",
                "Rosa",
                "HImachal Pradesh",
                "A rose is a woody perennial flowering plant of the genus Rosa, in the family Rosaceae, or the flower it bears. There are over three hundred species and tens of thousands of cultivars. They form a group of plants that can be erect shrubs, climbing, or trailing, with stems that are often armed with sharp prickles\n Scientific name: Rosa \n Order: Rosales \n Family: Rosaceae \n Kingdom: Plantae"

            )
        )

        FlowerList.add(
            FlowerData(
                2,
                "Lotus",
                "Nelumbo nucifera",
                "Gujarat",
                "Nelumbo nucifera, also known as Indian lotus, sacred lotus, or simply lotus, is one of two extant species of aquatic plant in the family Nelumbonaceae. It is sometimes colloquially called a water lily, though this more often refers to members of the family Nymphaeaceae.\n Scientific name: Nelumbo nucifera \n Order: Proteales \n Family: Nelumbonaceae \n Kingdom: Plantae \n "
            )
        )
        FlowerList.add(
            FlowerData(
                3,
                "Sunflower",
                "Helianthus annuus",
                "Arunachal Pradesh",
                "Helianthus annuus, the common sunflower, is a large annual forb of the genus Helianthus grown as a crop for its edible oil and edible fruits. This sunflower species is also used as wild bird food, as livestock forage, in some industrial applications, and as an ornamental in domestic gardens.\nScientific name: Helianthus annuus \nFamily: Asteraceae \n Kingdom: Plantae \nOrder: Asterales   "
            )
        )
        FlowerList.add(
            FlowerData(
                4,
                "Tulip",
                "Tulipa",
                "Uttrakhand",
                "Tulips are a genus of spring-blooming perennial herbaceous bulbiferous geophytes. The flowers are usually large, showy and brightly colored, generally red, pink, yellow, or white. They often have a different colored blotch at the base of the tepals, internally. \n Scientific name: Tulipa \n Order: Liliales \n Family: Liliaceae \n Kingdom: Plantae \n Tribe: Lilieae   "
            )
        )
        FlowerList.add(
            FlowerData(
                5,
                "Marigold",
                "Tagetes",
                "Meghalaya",
                "Tagetes is a genus of annual or perennial, mostly herbaceous plants in the sunflower family Asteraceae. They are among several groups of plants known in English as marigolds. The genus Tagetes was described by Carl Linnaeus in 1753. \nScientific name: Tagetes \n Order: Daisy family  "           )
        )
        FlowerList.add(
            FlowerData(
                6,
                "Magnolia",
                "Magnolia",
                "Manipur",
                "Magnolia is a large genus of about 210 flowering plant species in the subfamily Magnolioideae of the family Magnoliaceae. It is named after French botanist Pierre Magnol. Magnolia is an ancient genus. Appearing before bees evolved, the flowers are theorized to have evolved to encourage pollination by beetles. \nGenus: Magnolia; L. \nFamily: Magnoliaceae \nOrder: Magnoliales \nKingdom: Plantae    "
            )
        )
        FlowerList.add(
            FlowerData(
                7,
                "Lavender",
                "Lavandula",
                "Tripura",
                "Lavandula is a genus of 47 known species of flowering plants in the mint family, Lamiaceae. It is native to the Old World and is found in Cape Verde and the Canary Islands, and from Europe across to northern and eastern Africa, the Mediterranean, southwest Asia to India \nLavandula is a genus of 47 known species of flowering plants in the mint family, Lamiaceae. It is native to the Old World and is found in Cape Verde and the Canary Islands, and from Europe across to northern and eastern Africa, the Mediterranean, southwest Asia to India \nFamily: Lamiaceae \nSubfamily: Nepetoideae \nOrder: Lamiales \nOrder: Lamiales \nTribe: Ocimeae  "
            )
        )

        FlowerList.add(
            FlowerData(
                8,
                "Jasmine",
                "Jasminum",
                "Jammu Kashmir",
                "Jasmine is a genus of shrubs and vines in the olive family. It contains around 200 species native to tropical and warm temperate regions of Eurasia and Oceania. Jasmines are widely cultivated for the characteristic fragrance of their flowers.\nScientific name: Jasminum \nFamily: Oleaceae \nOrder: Lamiales \nKingdom: Plantae  "
            )
        )

     return FlowerList

    }
}