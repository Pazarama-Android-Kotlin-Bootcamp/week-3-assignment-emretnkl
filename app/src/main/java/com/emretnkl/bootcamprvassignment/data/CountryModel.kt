package com.emretnkl.bootcamprvassignment.data
import android.os.Parcelable
import com.google.gson.Gson
import kotlinx.parcelize.Parcelize

// The CountryModel is being created.
@Parcelize
data class CountryModel(
    val id: String,
    val countryName: String,
    val capitalCity: String,
    val population: String,
    val imgUrl: String,
    val description: String
) : Parcelable {
    fun toJson(): String {
        return Gson().toJson(this)
    }
    companion object {
        fun fromJson(jsonValue: String) : CountryModel {
            return Gson().fromJson(jsonValue, CountryModel::class.java)
        }
    }
}

// The MockData is being created.
val mockCountryData = mutableListOf<CountryModel>(
    CountryModel(
        "1",
        "France",
        "Paris",
        "67 Million",
        "https://images.adsttc.com/media/images/5d44/14fa/284d/d1fd/3a00/003d/large_jpg/eiffel-tower-in-paris-151-medium.jpg?1564742900",
        "   France is known as one of the most beautiful countries in the world, with the Eiffel Tower and Paris’ architecture being some of the country’s main draws. While traditional stops like the Louvre and the Palace of Versailles are always the main attractions for tourists, there are other reasons that so many people visit the country. \n" +
                "\n" +
                "   In the last few decades, Disneyland Paris has grown in popularity, but visitors also adore France for its cuisine and stunning mountains. "


    ),
    CountryModel(
        "2",
        "Spain",
        "Madrid",
        "47 Million",
        "https://upload.wikimedia.org/wikipedia/commons/thumb/9/92/Gran_V%C3%ADa_%28Madrid%29_1.jpg/1200px-Gran_V%C3%ADa_%28Madrid%29_1.jpg",
        "   Spain is a country that just seems to have it all, from the gorgeous scenery and stunning cities to quaint villages and fantastic food. \n" +
                "\n" +
                "   The natural beauty of Spain surrounds tourists throughout the country, but the Los Gigantes cliffs and thousands of beaches are some of the country’s most visited areas. "
    ),
    CountryModel(
        "3",
        "United States",
        "Washington DC",
        "329 Million",
        "https://www.thoughtco.com/thmb/JGE_xQpUmHb6oan75GMw0D4ensc=/2119x1415/filters:fill(auto,1)/GettyImages-497322993-598b2ad403f4020010ae0a08.jpg",
        "   The United States has remained one of the most visited countries in the world for a long time. Millions of people every year flock to different parts of the 50 states to experience top destinations, like New York City or Los Angeles. \n" +
                "\n" +
                "   However, since the USA is one of the largest countries, tourists enjoy visiting other exciting parts of the country as well, like Disneyworld, Yellowstone National Park, and the Las Vegas Strip. "
    ),
    CountryModel(
        "4",
        "China",
        "Beijing",
        "1.4 Billion",
        "https://scx2.b-cdn.net/gfx/news/2020/2-beijing.jpg",
        "   China retains its spot as one of the top tourist countries because of its breadth, beauty, and history. \n" +
                "\n" +
                "   As another one of the largest countries by land area, China captivates visitors because of its natural and cultural beauty. Of course, most travelers want to see the Great Wall and Beijing, but China is full of natural wonders and some of the oldest man-made sites in the world. "
    ),
    CountryModel(
        "5",
        "Italy",
        "Rome",
        "54 Million",
        "https://res.klook.com/image/upload/fl_lossy.progressive,w_800,c_fill,q_85/Mobile/City/afmqgg5h0jl9wnr1dfmf.jpg",
        "   Although located halfway around the world, Italy brings in tourists for many of the same reasons as China. Beautiful landscapes, along with a rich culture, make Italy a favorite.\n" +
                "\n" +
                "   As the country with the most World Heritage Sites, history and culture are usually the main reasons people worldwide choose to visit the Southern European country. As the birthplace of the Renaissance and the ancient Roman Empire, Italy contains countless instances of art and architecture spanning centuries."
    ),
    CountryModel(
        "6",
        "Turkey",
        "Ankara",
        "84 Million",
        "https://cdn.theculturetrip.com/wp-content/uploads/2021/03/pextyb-1.jpg",
        "   As the only Middle Eastern country to make it into the top 20, Turkey can offer travelers an experience unlike the other destinations on this list. \n" +
                "\n" +
                "   As the head of the Byzantine and Ottoman Empires and a history spanning over a millennium, Turkey’s culture and significant sites are vast. Turkey is also famous for its cuisine, most notably Turkish Coffee and Turkish Tea. \n" +
                "\n" +
                "   Another little-known reason people flock to Turkey is the amazing business opportunities possible in the country. "
    ),
    CountryModel(
        "7",
        "Mexico",
        "Mexico City",
        "128 Million",
        "https://www.ourescapeclause.com/wp-content/uploads/2016/12/shutterstock_1322105165-scaled.jpg",
        "   Mexico has long been one of the primary destinations for people from the US and Central America, but Mexico has been becoming more popular with international tourists. \n" +
                "\n" +
                "   Although many people still believe that Mexico is a dangerous country, it is actually safer than many destinations in the area. Over the years, more and more people are enjoying the variety that Mexico offers, from delicious food and drink to beaches and colonial towns. "
    ),
    CountryModel(
        "8",
        "Thailand",
        "Bangkok",
        "69 Million",
        "https://theplanetd.com/images/things-to-do-in-bangkok-temple-of-the-dawn.jpg",
        "   Thailand has established itself as one of the top tourist countries largely because visitors want to experience this Southeast Asian country’s gorgeous white beaches, busy nightlife, and fun markets. \n" +
                "\n" +
                "   Bangkok, in particular, is a tourist favorite in Thailand. The capital contains historic temples, museums and art galleries, famous restaurants, and sky bars. \n" +
                "\n" +
                "   Visitors also tend to enjoy the sunny weather and the low costs in the country. This convenience allows tourists to get more out of the kingdom."
    ),
    CountryModel(
        "9",
        "Germany",
        "Berlin",
        "83 Million",
        "https://cdn.getyourguide.com/img/location/6f156967bc6d6563.jpeg/99.jpg",
        "   Just like its other Western European neighbors, Germany is one of the most popular destinations in the world. \n" +
                "\n" +
                "   Many tourists visit Germany to get a look at its greatest cities, including, \n" +
                "\n" +
                "   Frankfurt \n" +
                "   Mainz\n" +
                "   Cologne\n" +
                "   Dusseldorf\n" +
                "   Berlin\n" +
                "   Munich\n" +
                "   Hamburg. \n \n" +
                "   Yet, this destination appeals to international visitors for other reasons as well. For instance, several events draw tourists, such as Oktoberfest, Carnival Season, the Berlin Film Festival, and the Frankfurt Book Fair. "

    ),
    CountryModel(
        "10",
        "United Kingdom",
        "London",
        "67 Million",
        "https://london.com/wp-content/uploads/2017/04/London-Bridge-and-Big-Ben-at-Night-1-1-2.jpg",
        "   The United Kingdom remains one of the most visited countries globally, and for a good reason. The UK houses extensive culture, history, and scenery, making it a world favorite for centuries. \n" +
                "\n" +
                "   With shows and movies like Harry Potter and Downton Abbey showing off the grand scenes that exist in the island nation, it’s no wonder that people around the world want to see the country for themselves. From Iron Age forts and Medieval castles to astounding cliffs and rolling hills, the UK continues to capture the world’s imagination. "
    ),
    CountryModel(
        "11",
        "Japan",
        "Tokyo",
        "125 Million",
        "https://media.cntraveler.com/photos/5a99a85dafa6cb3864785ca5/master/w_1200,c_limit/Tokyo_GettyImages-505797368.jpg",
        "   Japan is best known for its innovation and culture, which continuously entices international visitors. Renowned for anime, fashion, and technology, Japan receives millions of tourists a year. \n" +
                "\n" +
                "   But Tokyo and other big cities aren’t the only destinations people seem to love. Visitors are also excited to see towering Mount Fuji with their own eyes as well as the cherry blossoms and extensive forests of the country. "
    ),
    CountryModel(
        "12",
        "Austria",
        "Vienna",
        "8 Million",
        "https://i.guim.co.uk/img/media/44907381ba02489d60c01ed449fbbef4f82c9bd4/0_579_8688_5213/master/8688.jpg?width=1200&quality=85&auto=format&fit=max&s=5d57831bfe1d69bb81a6057cbb2ce009",
        "   Although Austria doesn’t get as much press as some of the other countries on this list, people still adore the Central European nation. \n" +
                "\n" +
                "   Austria is one of the few countries that can keep up its enticement to international visitors year-round. During the summer, tourists can comfortably visit the country’s many gorgeous destinations, like Vienna. When it’s cold, though, visitors prefer to ski at some of the country’s best resorts. "
    ),
    CountryModel(
        "13",
        "Greece",
        "Athens",
        "10 Million",
        "https://i0.wp.com/greekerthanthegreeks.com/wp-content/uploads/2014/11/acropolis-athens-greece-lead.ngsversion.1542586147848.adapt_.1900.1-1.jpg?fit=1900%2C1274&ssl=1",
        "   Home to the ancient Greek city-states, Greece has long been considered one of the most influential cultures in Western society. \n" +
                "\n" +
                "   From the Parthenon to the original Olympic fields, history abounds in the Mediterranean nation. Visitors can also experience the fantastic food, wine, and coffee that defines modern Greek life. "
    ),
    CountryModel(
        "14",
        "Malaysia",
        "Kuala Lumpur",
        "32 Million",
        "https://upload.wikimedia.org/wikipedia/commons/thumb/c/cc/Kuala_Lumpur_Skyline_at_dusk_1.jpg/1200px-Kuala_Lumpur_Skyline_at_dusk_1.jpg",
        "   After Thailand, Malaysia is one of the main tourist favorites in Southeast Asia. \n" +
                "\n" +
                "   Visitors can explore the extensive natural world of the land, including caves, tropical beaches, wild orangutans and tigers, tea plantations, and mountains.\n" +
                "\n" +
                "   However, the manufactured parts of Malaysia can be just as stunning. For instance, many people come to Kuala Lumpur to see the Petronas Twin Towers, which were once the largest buildings in the world. "
    ),
    CountryModel(
        "15",
        "Portugal",
        "Lisbon",
        "10 Million",
        "https://www.collegiate-ac.pt/propeller/uploads/sites/4/2020/11/ruas-mais-bonitas-de-lisboa-1-1450x967.jpg",
        "Portugal is another of the most visited countries in the world, located in Western Europe. Just like its Spanish neighbor, Portugal houses some of the most captivating cities and towns on the planet. Portugal is also a great way to see Western Europe without spending too much.\n" +
                "\n" +
                "In the Atlantic-coasted nation, tourists find a safe country that is easy to travel throughout while also containing some of the most remarkable architecture in the world. "
    ),
    CountryModel(
        "16",
        "Russia",
        "Moscow",
        "144 Million",
        "https://a.cdn-hotels.com/gdcs/production29/d1375/234f7170-c9f4-4cee-a372-1a198e388483.jpg",
        "   Although Russia is still one of the top tourist countries, people worldwide have had some reservations about traveling to the old Soviet country. \n" +
                "\n" +
                "   Even though certain places like Chechnya and Crimea may not be the best destinations, Russia is a massive nation with a lot of variety. Moscow and St. Petersburg are still favorites for travelers, and countless people enjoy popular Russian destinations without a worry. "
    ),
    CountryModel(
        "17",
        "Hong Kong",
        "Hong Kong",
        "7 Million",
        "https://www.discoverhongkong.com/content/dam/dhk/intl/what-s-new/events/dhk-highlighted-events/highlighted-hkharbourfiesta/highlighted-hkharbourfiesta-1920x1080.jpg",
        "   People often describe Hong Kong as the place where eastern and western traditions meet, and many travelers enjoy seeing the mesh of two different cultures.\n" +
                "\n" +
                "   Hong Kong is also an excellent place for people who love shopping and vibrant nightlife. The country is full of malls, shops, and markets that sell basically anything a person could want, and there’s never a shortage of bars and entertainment. "
    ),
    CountryModel(
        "18",
        "Poland",
        "Warsaw",
        "37 Million",
        "https://www.poland.travel/images/en-EN/Trending/Warszafka1170.jpg",
        "   Poland is one of the best places to experience Eastern Europe. The nation, in the heart of the European continent, houses 15 World Heritage Sites as well as forests, mountains, and lakes. \n" +
                "\n" +
                "   Visitors also enjoy the plethora of traditional cuisine that Poland offers, such as pierogi, glazed cheesecake, and bigos. Furthermore, the food and drink are also relatively cheap in the nation, and a meal often costs as little as three euros.  "
    ),
    CountryModel(
        "19",
        "Canada",
        "Ottawa",
        "38 Million",
        "https://a.cdn-hotels.com/gdcs/production163/d857/cc29dd0e-f745-4507-80e1-6ae5a3532338.jpg",
        "   Canada’s expansive natural beauty tends to be one of the top reasons that people want to visit the enormous country. The nation holds almost every type of landscape, including forests, mountains, and even some desert. \n" +
                "\n" +
                "   Furthermore, Canada’s cities are also safe and multicultural, making them a world favorite. Some of Canada’s most visited cities include:\n" +
                "\n" +
                "   Vancouver\n" +
                "   Calgary \n" +
                "   Niagara Falls\n" +
                "   Toronto\n" +
                "   Ottawa\n" +
                "   Montreal\n" +
                "   Quebec City\n" +
                "   Halifax "
    ),
    CountryModel(
        "20",
        "Netherlands",
        "Amsterdam",
        "17 Million",
        "https://a.cdn-hotels.com/gdcs/production157/d1706/0c271631-545f-4f5f-8145-e59904c725ae.jpg",
        "   The Netherlands keeps bringing in tourists because of its quaint villages, bustling cities, and well-liked art and architecture. \n" +
                "\n" +
                "   From the national parks like Dunes of Texel and Zuid-Kennemerland to the big cities of Amsterdam and Rotterdam, travelers like to explore the beautiful landscapes and rich culture of this small European nation.\n" +
                "\n" +
                "   The country has also produced world-famous artists like Rembrandt and Vincent van Gogh. "
    )
)

