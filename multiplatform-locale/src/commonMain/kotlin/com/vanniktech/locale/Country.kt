package com.vanniktech.locale

enum class Country(
  /** ISO 3166-1 alpha-2 code - https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2 */
  override val code: String,
  /** ISO 3166-1 alpha-3 code - https://en.wikipedia.org/wiki/ISO_3166-1_alpha-3 */
  override val code3: String,
  /**
   * The calling code that can be used for calling.
   * May contain more than one entry for some rarities.
   * Table overview: https://en.wikipedia.org/wiki/List_of_country_calling_codes
   */
  val callingCodes: List<String>,
  /** The [Continent]s it belongs to. Sometimes there can be more than one. */
  override val continents: List<Continent>,
) : Territory {
  AFGHANISTAN(code = "AF", code3 = "AFG", callingCodes = listOf("+93"), continents = listOf(Continent.ASIA)),
  ALAND_ISLANDS(code = "AX", code3 = "ALA", callingCodes = listOf("+358"), continents = listOf(Continent.EUROPE)),
  ALBANIA(code = "AL", code3 = "ALB", callingCodes = listOf("+355"), continents = listOf(Continent.EUROPE)),
  ALGERIA(code = "DZ", code3 = "DZA", callingCodes = listOf("+213"), continents = listOf(Continent.AFRICA)),
  AMERICAN_SAMOA(code = "AS", code3 = "ASM", callingCodes = listOf("+1684"), continents = listOf(Continent.OCEANIA)),
  ANDORRA(code = "AD", code3 = "AND", callingCodes = listOf("+376"), continents = listOf(Continent.EUROPE)),
  ANGOLA(code = "AO", code3 = "AGO", callingCodes = listOf("+244"), continents = listOf(Continent.AFRICA)),
  ANGUILLA(code = "AI", code3 = "AIA", callingCodes = listOf("+1264"), continents = listOf(Continent.NORTH_AMERICA)),
  ANTARCTICA(code = "AQ", code3 = "ATA", callingCodes = listOf("+672"), continents = listOf(Continent.ANTARCTICA)),
  ANTIGUA_AND_BARBUDA(code = "AG", code3 = "ATG", callingCodes = listOf("+1268"), continents = listOf(Continent.NORTH_AMERICA)),
  ARGENTINA(code = "AR", code3 = "ARG", callingCodes = listOf("+54"), continents = listOf(Continent.SOUTH_AMERICA)),
  ARMENIA(code = "AM", code3 = "ARM", callingCodes = listOf("+374"), continents = listOf(Continent.ASIA)),
  ARUBA(code = "AW", code3 = "ABW", callingCodes = listOf("+297"), continents = listOf(Continent.NORTH_AMERICA)),
  AUSTRALIA(code = "AU", code3 = "AUS", callingCodes = listOf("+61"), continents = listOf(Continent.OCEANIA)),
  AUSTRIA(code = "AT", code3 = "AUT", callingCodes = listOf("+43"), continents = listOf(Continent.EUROPE)),
  AZERBAIJAN(code = "AZ", code3 = "AZE", callingCodes = listOf("+994"), continents = listOf(Continent.ASIA)),
  BAHAMAS(code = "BS", code3 = "BHS", callingCodes = listOf("+1242"), continents = listOf(Continent.NORTH_AMERICA)),
  BAHRAIN(code = "BH", code3 = "BHR", callingCodes = listOf("+973"), continents = listOf(Continent.ASIA)),
  BANGLADESH(code = "BD", code3 = "BGD", callingCodes = listOf("+880"), continents = listOf(Continent.ASIA)),
  BARBADOS(code = "BB", code3 = "BRB", callingCodes = listOf("+1246"), continents = listOf(Continent.NORTH_AMERICA)),
  BELARUS(code = "BY", code3 = "BLR", callingCodes = listOf("+375"), continents = listOf(Continent.EUROPE)),
  BELGIUM(code = "BE", code3 = "BEL", callingCodes = listOf("+32"), continents = listOf(Continent.EUROPE)),
  BELIZE(code = "BZ", code3 = "BLZ", callingCodes = listOf("+501"), continents = listOf(Continent.NORTH_AMERICA)),
  BENIN(code = "BJ", code3 = "BEN", callingCodes = listOf("+229"), continents = listOf(Continent.AFRICA)),
  BERMUDA(code = "BM", code3 = "BMU", callingCodes = listOf("+1441"), continents = listOf(Continent.NORTH_AMERICA)),
  BHUTAN(code = "BT", code3 = "BTN", callingCodes = listOf("+975"), continents = listOf(Continent.ASIA)),
  BOLIVIA(code = "BO", code3 = "BOL", callingCodes = listOf("+591"), continents = listOf(Continent.SOUTH_AMERICA)),
  BONAIRE(code = "BQ", code3 = "BES", callingCodes = listOf("+599"), continents = listOf(Continent.NORTH_AMERICA)),
  BOSNIA_AND_HERZEGOVINA(code = "BA", code3 = "BIH", callingCodes = listOf("+387"), continents = listOf(Continent.EUROPE)),
  BOTSWANA(code = "BW", code3 = "BWA", callingCodes = listOf("+267"), continents = listOf(Continent.AFRICA)),
  BOUVET_ISLAND(code = "BV", code3 = "BVT", callingCodes = listOf("+47"), continents = listOf(Continent.ANTARCTICA)),
  BRAZIL(code = "BR", code3 = "BRA", callingCodes = listOf("+55"), continents = listOf(Continent.SOUTH_AMERICA)),
  BRITISH_INDIAN_OCEAN_TERRITORY(code = "IO", code3 = "IOT", callingCodes = listOf("+246"), continents = listOf(Continent.ASIA)),
  BRITISH_VIRGIN_ISLANDS(code = "VG", code3 = "VGB", callingCodes = listOf("+1284"), continents = listOf(Continent.NORTH_AMERICA)),
  BRUNEI(code = "BN", code3 = "BRN", callingCodes = listOf("+673"), continents = listOf(Continent.ASIA)),
  BULGARIA(code = "BG", code3 = "BGR", callingCodes = listOf("+359"), continents = listOf(Continent.EUROPE)),
  BURKINA_FASO(code = "BF", code3 = "BFA", callingCodes = listOf("+226"), continents = listOf(Continent.AFRICA)),
  BURUNDI(code = "BI", code3 = "BDI", callingCodes = listOf("+257"), continents = listOf(Continent.AFRICA)),
  CAMBODIA(code = "KH", code3 = "KHM", callingCodes = listOf("+855"), continents = listOf(Continent.ASIA)),
  CAMEROON(code = "CM", code3 = "CMR", callingCodes = listOf("+237"), continents = listOf(Continent.AFRICA)),
  CANADA(code = "CA", code3 = "CAN", callingCodes = listOf("+1"), continents = listOf(Continent.NORTH_AMERICA)),
  CAPE_VERDE(code = "CV", code3 = "CPV", callingCodes = listOf("+238"), continents = listOf(Continent.AFRICA)),
  CAYMAN_ISLANDS(code = "KY", code3 = "CYM", callingCodes = listOf("+1345"), continents = listOf(Continent.NORTH_AMERICA)),
  CENTRAL_AFRICAN_REPUBLIC(code = "CF", code3 = "CAF", callingCodes = listOf("+236"), continents = listOf(Continent.AFRICA)),
  CHAD(code = "TD", code3 = "TCD", callingCodes = listOf("+235"), continents = listOf(Continent.AFRICA)),
  CHILE(code = "CL", code3 = "CHL", callingCodes = listOf("+56"), continents = listOf(Continent.SOUTH_AMERICA)),
  CHINA(code = "CN", code3 = "CHN", callingCodes = listOf("+86"), continents = listOf(Continent.ASIA)),
  CHRISTMAS_ISLAND(code = "CX", code3 = "CXR", callingCodes = listOf("+61"), continents = listOf(Continent.ASIA)),
  COCOS_ISLANDS(code = "CC", code3 = "CCK", callingCodes = listOf("+61"), continents = listOf(Continent.ASIA)),
  COLOMBIA(code = "CO", code3 = "COL", callingCodes = listOf("+57"), continents = listOf(Continent.SOUTH_AMERICA)),
  COMOROS(code = "KM", code3 = "COM", callingCodes = listOf("+269"), continents = listOf(Continent.AFRICA)),
  COOK_ISLANDS(code = "CK", code3 = "COK", callingCodes = listOf("+682"), continents = listOf(Continent.OCEANIA)),
  COSTA_RICA(code = "CR", code3 = "CRI", callingCodes = listOf("+506"), continents = listOf(Continent.NORTH_AMERICA)),
  COTE_DIVOIRE(code = "CI", code3 = "CIV", callingCodes = listOf("+225"), continents = listOf(Continent.AFRICA)),
  CROATIA(code = "HR", code3 = "HRV", callingCodes = listOf("+385"), continents = listOf(Continent.EUROPE)),
  CUBA(code = "CU", code3 = "CUB", callingCodes = listOf("+53"), continents = listOf(Continent.NORTH_AMERICA)),
  CURACAO(code = "CW", code3 = "CUW", callingCodes = listOf("+599"), continents = listOf(Continent.NORTH_AMERICA)),
  CYPRUS(code = "CY", code3 = "CYP", callingCodes = listOf("+357"), continents = listOf(Continent.ASIA)),
  CZECHIA(code = "CZ", code3 = "CZE", callingCodes = listOf("+420"), continents = listOf(Continent.EUROPE)),
  DEMOCRATIC_REPUBLIC_OF_CONGO(code = "CD", code3 = "COD", callingCodes = listOf("+243"), continents = listOf(Continent.AFRICA)),
  DENMARK(code = "DK", code3 = "DNK", callingCodes = listOf("+45"), continents = listOf(Continent.EUROPE)),
  DJIBOUTI(code = "DJ", code3 = "DJI", callingCodes = listOf("+253"), continents = listOf(Continent.AFRICA)),
  DOMINICA(code = "DM", code3 = "DMA", callingCodes = listOf("+1767"), continents = listOf(Continent.NORTH_AMERICA)),
  DOMINICAN_REPUBLIC(code = "DO", code3 = "DOM", callingCodes = listOf("+1809"), continents = listOf(Continent.NORTH_AMERICA)),
  ECUADOR(code = "EC", code3 = "ECU", callingCodes = listOf("+593"), continents = listOf(Continent.SOUTH_AMERICA)),
  EGYPT(code = "EG", code3 = "EGY", callingCodes = listOf("+20"), continents = listOf(Continent.AFRICA)),
  EL_SALVADOR(code = "SV", code3 = "SLV", callingCodes = listOf("+503"), continents = listOf(Continent.NORTH_AMERICA)),
  ENGLAND(code = "GB", code3 = "GBR", callingCodes = listOf("+44"), continents = listOf(Continent.EUROPE)),
  EQUATORIAL_GUINEA(code = "GQ", code3 = "GNQ", callingCodes = listOf("+240"), continents = listOf(Continent.AFRICA)),
  ERITREA(code = "ER", code3 = "ERI", callingCodes = listOf("+291"), continents = listOf(Continent.AFRICA)),
  ESTONIA(code = "EE", code3 = "EST", callingCodes = listOf("+372"), continents = listOf(Continent.EUROPE)),
  ESWATINI(code = "SZ", code3 = "SWZ", callingCodes = listOf("+268"), continents = listOf(Continent.AFRICA)),
  ETHIOPIA(code = "ET", code3 = "ETH", callingCodes = listOf("+251"), continents = listOf(Continent.AFRICA)),
  FALKLAND_ISLANDS(code = "FK", code3 = "FLK", callingCodes = listOf("+500"), continents = listOf(Continent.SOUTH_AMERICA)),
  FAROE_ISLANDS(code = "FO", code3 = "FRO", callingCodes = listOf("+298"), continents = listOf(Continent.EUROPE)),
  FIJI(code = "FJ", code3 = "FJI", callingCodes = listOf("+679"), continents = listOf(Continent.OCEANIA)),
  FINLAND(code = "FI", code3 = "FIN", callingCodes = listOf("+358"), continents = listOf(Continent.EUROPE)),
  FRANCE(code = "FR", code3 = "FRA", callingCodes = listOf("+33"), continents = listOf(Continent.EUROPE)),
  FRENCH_GUIANA(code = "GF", code3 = "GUF", callingCodes = listOf("+594"), continents = listOf(Continent.SOUTH_AMERICA)),
  FRENCH_POLYNESIA(code = "PF", code3 = "PYF", callingCodes = listOf("+689"), continents = listOf(Continent.OCEANIA)),
  FRENCH_SOUTHERN_AND_ANTARCTIC_LANDS(code = "TF", code3 = "ATF", callingCodes = listOf("+33"), continents = listOf(Continent.AFRICA, Continent.ANTARCTICA)),
  GABON(code = "GA", code3 = "GAB", callingCodes = listOf("+241"), continents = listOf(Continent.AFRICA)),
  GAMBIA(code = "GM", code3 = "GMB", callingCodes = listOf("+220"), continents = listOf(Continent.AFRICA)),
  GEORGIA(code = "GE", code3 = "GEO", callingCodes = listOf("+995"), continents = listOf(Continent.ASIA)),
  GERMANY(code = "DE", code3 = "DEU", callingCodes = listOf("+49"), continents = listOf(Continent.EUROPE)),
  GHANA(code = "GH", code3 = "GHA", callingCodes = listOf("+233"), continents = listOf(Continent.AFRICA)),
  GIBRALTAR(code = "GI", code3 = "GIB", callingCodes = listOf("+350"), continents = listOf(Continent.EUROPE)),
  GREECE(code = "GR", code3 = "GRC", callingCodes = listOf("+30"), continents = listOf(Continent.EUROPE)),
  GREENLAND(code = "GL", code3 = "GRL", callingCodes = listOf("+299"), continents = listOf(Continent.NORTH_AMERICA)),
  GRENADA(code = "GD", code3 = "GRD", callingCodes = listOf("+1473"), continents = listOf(Continent.NORTH_AMERICA)),
  GUADELOUPE(code = "GP", code3 = "GLP", callingCodes = listOf("+590"), continents = listOf(Continent.NORTH_AMERICA)),
  GUAM(code = "GU", code3 = "GUM", callingCodes = listOf("+1671"), continents = listOf(Continent.OCEANIA)),
  GUATEMALA(code = "GT", code3 = "GTM", callingCodes = listOf("+502"), continents = listOf(Continent.NORTH_AMERICA)),
  GUERNSEY(code = "GG", code3 = "GGY", callingCodes = listOf("+44"), continents = listOf(Continent.EUROPE)),
  GUINEA(code = "GN", code3 = "GIN", callingCodes = listOf("+224"), continents = listOf(Continent.AFRICA)),
  GUINEA_BISSAU(code = "GW", code3 = "GNB", callingCodes = listOf("+245"), continents = listOf(Continent.AFRICA)),
  GUYANA(code = "GY", code3 = "GUY", callingCodes = listOf("+592"), continents = listOf(Continent.SOUTH_AMERICA)),
  HAITI(code = "HT", code3 = "HTI", callingCodes = listOf("+509"), continents = listOf(Continent.NORTH_AMERICA)),
  HEARD_ISLAND_AND_MCDONALD_ISLANDS(code = "HM", code3 = "HMD", callingCodes = listOf("+672"), continents = listOf(Continent.ANTARCTICA)),
  HONDURAS(code = "HN", code3 = "HND", callingCodes = listOf("+504"), continents = listOf(Continent.NORTH_AMERICA)),
  HONG_KONG(code = "HK", code3 = "HKG", callingCodes = listOf("+852"), continents = listOf(Continent.ASIA)),
  HUNGARY(code = "HU", code3 = "HUN", callingCodes = listOf("+36"), continents = listOf(Continent.EUROPE)),
  ICELAND(code = "IS", code3 = "ISL", callingCodes = listOf("+354"), continents = listOf(Continent.EUROPE)),
  INDIA(code = "IN", code3 = "IND", callingCodes = listOf("+91"), continents = listOf(Continent.ASIA)),
  INDONESIA(code = "ID", code3 = "IDN", callingCodes = listOf("+62"), continents = listOf(Continent.ASIA)),
  IRAN(code = "IR", code3 = "IRN", callingCodes = listOf("+98"), continents = listOf(Continent.ASIA)),
  IRAQ(code = "IQ", code3 = "IRQ", callingCodes = listOf("+964"), continents = listOf(Continent.ASIA)),
  IRELAND(code = "IE", code3 = "IRL", callingCodes = listOf("+353"), continents = listOf(Continent.EUROPE)),
  ISLE_OF_MAN(code = "IM", code3 = "IMN", callingCodes = listOf("+44"), continents = listOf(Continent.EUROPE)),
  ISRAEL(code = "IL", code3 = "ISR", callingCodes = listOf("+972"), continents = listOf(Continent.ASIA)),
  ITALY(code = "IT", code3 = "ITA", callingCodes = listOf("+39"), continents = listOf(Continent.EUROPE)),
  JAMAICA(code = "JM", code3 = "JAM", callingCodes = listOf("+1876"), continents = listOf(Continent.NORTH_AMERICA)),
  JAPAN(code = "JP", code3 = "JPN", callingCodes = listOf("+81"), continents = listOf(Continent.ASIA)),
  JERSEY(code = "JE", code3 = "JEY", callingCodes = listOf("+44"), continents = listOf(Continent.EUROPE)),
  JORDAN(code = "JO", code3 = "JOR", callingCodes = listOf("+962"), continents = listOf(Continent.ASIA)),
  KAZAKHSTAN(code = "KZ", code3 = "KAZ", callingCodes = listOf("+7"), continents = listOf(Continent.ASIA, Continent.EUROPE)),
  KENYA(code = "KE", code3 = "KEN", callingCodes = listOf("+254"), continents = listOf(Continent.AFRICA)),
  KIRIBATI(code = "KI", code3 = "KIR", callingCodes = listOf("+686"), continents = listOf(Continent.OCEANIA)),
  KOSOVO(code = "XK", code3 = "UNK", callingCodes = listOf("+383"), continents = listOf(Continent.EUROPE)),
  KUWAIT(code = "KW", code3 = "KWT", callingCodes = listOf("+965"), continents = listOf(Continent.ASIA)),
  KYRGYZSTAN(code = "KG", code3 = "KGZ", callingCodes = listOf("+996"), continents = listOf(Continent.ASIA)),
  LAOS(code = "LA", code3 = "LAO", callingCodes = listOf("+856"), continents = listOf(Continent.ASIA)),
  LATVIA(code = "LV", code3 = "LVA", callingCodes = listOf("+371"), continents = listOf(Continent.EUROPE)),
  LEBANON(code = "LB", code3 = "LBN", callingCodes = listOf("+961"), continents = listOf(Continent.ASIA)),
  LESOTHO(code = "LS", code3 = "LSO", callingCodes = listOf("+266"), continents = listOf(Continent.AFRICA)),
  LIBERIA(code = "LR", code3 = "LBR", callingCodes = listOf("+231"), continents = listOf(Continent.AFRICA)),
  LIBYA(code = "LY", code3 = "LBY", callingCodes = listOf("+218"), continents = listOf(Continent.AFRICA)),
  LIECHTENSTEIN(code = "LI", code3 = "LIE", callingCodes = listOf("+423"), continents = listOf(Continent.EUROPE)),
  LITHUANIA(code = "LT", code3 = "LTU", callingCodes = listOf("+370"), continents = listOf(Continent.EUROPE)),
  LUXEMBOURG(code = "LU", code3 = "LUX", callingCodes = listOf("+352"), continents = listOf(Continent.EUROPE)),
  MACAO(code = "MO", code3 = "MAC", callingCodes = listOf("+853"), continents = listOf(Continent.ASIA)),
  MADAGASCAR(code = "MG", code3 = "MDG", callingCodes = listOf("+261"), continents = listOf(Continent.AFRICA)),
  MALAWI(code = "MW", code3 = "MWI", callingCodes = listOf("+265"), continents = listOf(Continent.AFRICA)),
  MALAYSIA(code = "MY", code3 = "MYS", callingCodes = listOf("+60"), continents = listOf(Continent.ASIA)),
  MALDIVES(code = "MV", code3 = "MDV", callingCodes = listOf("+960"), continents = listOf(Continent.ASIA)),
  MALI(code = "ML", code3 = "MLI", callingCodes = listOf("+223"), continents = listOf(Continent.AFRICA)),
  MALTA(code = "MT", code3 = "MLT", callingCodes = listOf("+356"), continents = listOf(Continent.EUROPE)),
  MARSHALL_ISLAND(code = "MH", code3 = "MHL", callingCodes = listOf("+692"), continents = listOf(Continent.OCEANIA)),
  MARTINIQUE(code = "MQ", code3 = "MTQ", callingCodes = listOf("+596"), continents = listOf(Continent.NORTH_AMERICA)),
  MAURITANIA(code = "MR", code3 = "MRT", callingCodes = listOf("+222"), continents = listOf(Continent.AFRICA)),
  MAURITIUS(code = "MU", code3 = "MUS", callingCodes = listOf("+230"), continents = listOf(Continent.AFRICA)),
  MAYOTTE(code = "YT", code3 = "MYT", callingCodes = listOf("+262"), continents = listOf(Continent.AFRICA)),
  MEXICO(code = "MX", code3 = "MEX", callingCodes = listOf("+52"), continents = listOf(Continent.NORTH_AMERICA)),
  MICRONESIA(code = "FM", code3 = "FSM", callingCodes = listOf("+691"), continents = listOf(Continent.OCEANIA)),
  MOLDOVA(code = "MD", code3 = "MDA", callingCodes = listOf("+373"), continents = listOf(Continent.EUROPE)),
  MONACO(code = "MC", code3 = "MCO", callingCodes = listOf("+377"), continents = listOf(Continent.EUROPE)),
  MONGOLIA(code = "MN", code3 = "MNG", callingCodes = listOf("+976"), continents = listOf(Continent.ASIA)),
  MONTENEGRO(code = "ME", code3 = "MNE", callingCodes = listOf("+382"), continents = listOf(Continent.EUROPE)),
  MONTSERRAT(code = "MS", code3 = "MSR", callingCodes = listOf("+1664"), continents = listOf(Continent.NORTH_AMERICA)),
  MOROCCO(code = "MA", code3 = "MAR", callingCodes = listOf("+212"), continents = listOf(Continent.AFRICA)),
  MOZAMBIQUE(code = "MZ", code3 = "MOZ", callingCodes = listOf("+258"), continents = listOf(Continent.AFRICA)),
  MYANMAR(code = "MM", code3 = "MMR", callingCodes = listOf("+95"), continents = listOf(Continent.ASIA)),
  NAMIBIA(code = "NA", code3 = "NAM", callingCodes = listOf("+264"), continents = listOf(Continent.AFRICA)),
  NAURU(code = "NR", code3 = "NRU", callingCodes = listOf("+674"), continents = listOf(Continent.OCEANIA)),
  NEPAL(code = "NP", code3 = "NPL", callingCodes = listOf("+977"), continents = listOf(Continent.ASIA)),
  NETHERLANDS(code = "NL", code3 = "NLD", callingCodes = listOf("+31"), continents = listOf(Continent.EUROPE)),
  NEW_CALEDONIA(code = "NC", code3 = "NCL", callingCodes = listOf("+687"), continents = listOf(Continent.OCEANIA)),
  NEW_ZEALAND(code = "NZ", code3 = "NZL", callingCodes = listOf("+64"), continents = listOf(Continent.OCEANIA)),
  NICARAGUA(code = "NI", code3 = "NIC", callingCodes = listOf("+505"), continents = listOf(Continent.NORTH_AMERICA)),
  NIGER(code = "NE", code3 = "NER", callingCodes = listOf("+227"), continents = listOf(Continent.AFRICA)),
  NIGERIA(code = "NG", code3 = "NGA", callingCodes = listOf("+234"), continents = listOf(Continent.AFRICA)),
  NIUE(code = "NU", code3 = "NIU", callingCodes = listOf("+683"), continents = listOf(Continent.OCEANIA)),
  NORFOLK_ISLAND(code = "NF", code3 = "NFK", callingCodes = listOf("+672"), continents = listOf(Continent.OCEANIA)),
  NORTHERN_MARIANA_ISLANDS(code = "MP", code3 = "MNP", callingCodes = listOf("+1670"), continents = listOf(Continent.OCEANIA)),
  NORTH_KOREA(code = "KP", code3 = "PRK", callingCodes = listOf("+850"), continents = listOf(Continent.ASIA)),
  NORTH_MACEDONIA(code = "MK", code3 = "MKD", callingCodes = listOf("+389"), continents = listOf(Continent.EUROPE)),
  NORWAY(code = "NO", code3 = "NOR", callingCodes = listOf("+47"), continents = listOf(Continent.EUROPE)),
  OMAN(code = "OM", code3 = "OMN", callingCodes = listOf("+968"), continents = listOf(Continent.ASIA)),
  PAKISTAN(code = "PK", code3 = "PAK", callingCodes = listOf("+92"), continents = listOf(Continent.ASIA)),
  PALAU(code = "PW", code3 = "PLW", callingCodes = listOf("+680"), continents = listOf(Continent.OCEANIA)),
  PALESTINE(code = "PS", code3 = "PSE", callingCodes = listOf("+970"), continents = listOf(Continent.ASIA)),
  PANAMA(code = "PA", code3 = "PAN", callingCodes = listOf("+507"), continents = listOf(Continent.NORTH_AMERICA)),
  PAPUA_NEW_GUINEA(code = "PG", code3 = "PNG", callingCodes = listOf("+675"), continents = listOf(Continent.OCEANIA)),
  PARAGUAY(code = "PY", code3 = "PRY", callingCodes = listOf("+595"), continents = listOf(Continent.SOUTH_AMERICA)),
  PERU(code = "PE", code3 = "PER", callingCodes = listOf("+51"), continents = listOf(Continent.SOUTH_AMERICA)),
  PHILIPPINES(code = "PH", code3 = "PHL", callingCodes = listOf("+63"), continents = listOf(Continent.ASIA)),
  PITCAIRN_ISLANDS(code = "PN", code3 = "PCN", callingCodes = listOf("+64"), continents = listOf(Continent.OCEANIA)),
  POLAND(code = "PL", code3 = "POL", callingCodes = listOf("+48"), continents = listOf(Continent.EUROPE)),
  PORTUGAL(code = "PT", code3 = "PRT", callingCodes = listOf("+351"), continents = listOf(Continent.EUROPE)),
  PUERTO_RICO(code = "PR", code3 = "PRI", callingCodes = listOf("+1787"), continents = listOf(Continent.NORTH_AMERICA)),
  QATAR(code = "QA", code3 = "QAT", callingCodes = listOf("+974"), continents = listOf(Continent.ASIA)),
  REPUBLIC_OF_THE_CONGO(code = "CG", code3 = "COG", callingCodes = listOf("+242"), continents = listOf(Continent.AFRICA)),
  REUNION(code = "RE", code3 = "REU", callingCodes = listOf("+262"), continents = listOf(Continent.AFRICA)),
  ROMANIA(code = "RO", code3 = "ROU", callingCodes = listOf("+40"), continents = listOf(Continent.EUROPE)),
  RUSSIA(code = "RU", code3 = "RUS", callingCodes = listOf("+7"), continents = listOf(Continent.EUROPE)),
  RWANDA(code = "RW", code3 = "RWA", callingCodes = listOf("+250"), continents = listOf(Continent.AFRICA)),
  SAHRAWI_ARAB_DEMOCRATIC_REPUBLIC(code = "EH", code3 = "ESH", callingCodes = listOf("+212"), continents = listOf(Continent.AFRICA)),
  SAINT_BARTS(code = "BL", code3 = "BLM", callingCodes = listOf("+590"), continents = listOf(Continent.NORTH_AMERICA)),
  SAINT_HELENA_ASCENSION_AND_TRISTAN_DA_CUNHA(code = "SH", code3 = "SHN", callingCodes = listOf("+290"), continents = listOf(Continent.AFRICA)),
  SAINT_KITTS_AND_NEVIS(code = "KN", code3 = "KNA", callingCodes = listOf("+1869"), continents = listOf(Continent.NORTH_AMERICA)),
  SAINT_LUCIA(code = "LC", code3 = "LCA", callingCodes = listOf("+1758"), continents = listOf(Continent.NORTH_AMERICA)),
  SAINT_MARTIN(code = "MF", code3 = "MAF", callingCodes = listOf("+590"), continents = listOf(Continent.NORTH_AMERICA)),
  SAINT_PIERRE_AND_MIQUELON(code = "PM", code3 = "SPM", callingCodes = listOf("+508"), continents = listOf(Continent.NORTH_AMERICA)),
  SAINT_VINCENT_AND_THE_GRENADINES(code = "VC", code3 = "VCT", callingCodes = listOf("+1784"), continents = listOf(Continent.NORTH_AMERICA)),
  SAMOA(code = "WS", code3 = "WSM", callingCodes = listOf("+685"), continents = listOf(Continent.OCEANIA)),
  SAN_MARINO(code = "SM", code3 = "SMR", callingCodes = listOf("+378"), continents = listOf(Continent.EUROPE)),
  SAO_TOME_AND_PRINCE(code = "ST", code3 = "STP", callingCodes = listOf("+239"), continents = listOf(Continent.AFRICA)),
  SAUDI_ARABIA(code = "SA", code3 = "SAU", callingCodes = listOf("+966"), continents = listOf(Continent.ASIA)),
  SENEGAL(code = "SN", code3 = "SEN", callingCodes = listOf("+221"), continents = listOf(Continent.AFRICA)),
  SERBIA(code = "RS", code3 = "SRB", callingCodes = listOf("+381"), continents = listOf(Continent.EUROPE)),
  SEYCHELLES(code = "SC", code3 = "SYC", callingCodes = listOf("+248"), continents = listOf(Continent.AFRICA)),
  SIERRA_LEONE(code = "SL", code3 = "SLE", callingCodes = listOf("+232"), continents = listOf(Continent.AFRICA)),
  SINGAPORE(code = "SG", code3 = "SGP", callingCodes = listOf("+65"), continents = listOf(Continent.ASIA)),
  SINT_MAARTEN(code = "SX", code3 = "SXM", callingCodes = listOf("+1721"), continents = listOf(Continent.NORTH_AMERICA)),
  SLOVAKIA(code = "SK", code3 = "SVK", callingCodes = listOf("+421"), continents = listOf(Continent.EUROPE)),
  SLOVENIA(code = "SI", code3 = "SVN", callingCodes = listOf("+386"), continents = listOf(Continent.EUROPE)),
  SOLOMON_ISLANDS(code = "SB", code3 = "SLB", callingCodes = listOf("+677"), continents = listOf(Continent.OCEANIA)),
  SOMALIA(code = "SO", code3 = "SOM", callingCodes = listOf("+252"), continents = listOf(Continent.AFRICA)),
  SOUTH_AFRICA(code = "ZA", code3 = "ZAF", callingCodes = listOf("+27"), continents = listOf(Continent.AFRICA)),
  SOUTH_GEORGIA_AND_THE_SOUTH_SANDWICH_ISLANDS(code = "GS", code3 = "SGS", callingCodes = listOf("+500"), continents = listOf(Continent.ANTARCTICA)),
  SOUTH_KOREA(code = "KR", code3 = "KOR", callingCodes = listOf("+82"), continents = listOf(Continent.ASIA)),
  SOUTH_SUDAN(code = "SS", code3 = "SSD", callingCodes = listOf("+211"), continents = listOf(Continent.AFRICA)),
  SPAIN(code = "ES", code3 = "ESP", callingCodes = listOf("+34"), continents = listOf(Continent.EUROPE)),
  SRI_LANKA(code = "LK", code3 = "LKA", callingCodes = listOf("+94"), continents = listOf(Continent.ASIA)),
  SUDAN(code = "SD", code3 = "SDN", callingCodes = listOf("+249"), continents = listOf(Continent.AFRICA)),
  SURINAME(code = "SR", code3 = "SUR", callingCodes = listOf("+597"), continents = listOf(Continent.SOUTH_AMERICA)),
  SVALBARD_AND_JAN_MAYEN(code = "SJ", code3 = "SJM", callingCodes = listOf("+47"), continents = listOf(Continent.EUROPE)),
  SWEDEN(code = "SE", code3 = "SWE", callingCodes = listOf("+46"), continents = listOf(Continent.EUROPE)),
  SWITZERLAND(code = "CH", code3 = "CHE", callingCodes = listOf("+41"), continents = listOf(Continent.EUROPE)),
  SYRIA(code = "SY", code3 = "SYR", callingCodes = listOf("+963"), continents = listOf(Continent.ASIA)),
  TAIWAN(code = "TW", code3 = "TWN", callingCodes = listOf("+886"), continents = listOf(Continent.ASIA)),
  TAJIKISTAN(code = "TJ", code3 = "TJK", callingCodes = listOf("+992"), continents = listOf(Continent.ASIA)),
  TANZANIA(code = "TZ", code3 = "TZA", callingCodes = listOf("+255"), continents = listOf(Continent.AFRICA)),
  THAILAND(code = "TH", code3 = "THA", callingCodes = listOf("+66"), continents = listOf(Continent.ASIA)),
  TIMOR_LESTE(code = "TL", code3 = "TLS", callingCodes = listOf("+670"), continents = listOf(Continent.ASIA)),
  TOGO(code = "TG", code3 = "TGO", callingCodes = listOf("+228"), continents = listOf(Continent.AFRICA)),
  TOKELAU(code = "TK", code3 = "TKL", callingCodes = listOf("+690"), continents = listOf(Continent.OCEANIA)),
  TONGA(code = "TO", code3 = "TON", callingCodes = listOf("+676"), continents = listOf(Continent.OCEANIA)),
  TRINIDAD_AND_TOBAGO(code = "TT", code3 = "TTO", callingCodes = listOf("+1868"), continents = listOf(Continent.NORTH_AMERICA)),
  TUNISIA(code = "TN", code3 = "TUN", callingCodes = listOf("+216"), continents = listOf(Continent.AFRICA)),
  TURKEY(code = "TR", code3 = "TUR", callingCodes = listOf("+90"), continents = listOf(Continent.EUROPE)),
  TURKMENISTAN(code = "TM", code3 = "TKM", callingCodes = listOf("+993"), continents = listOf(Continent.ASIA)),
  TURKS_AND_CAICOS(code = "TC", code3 = "TCA", callingCodes = listOf("+1649"), continents = listOf(Continent.NORTH_AMERICA)),
  TUVALU(code = "TV", code3 = "TUV", callingCodes = listOf("+688"), continents = listOf(Continent.OCEANIA)),
  UGANDA(code = "UG", code3 = "UGA", callingCodes = listOf("+256"), continents = listOf(Continent.AFRICA)),
  UKRAINE(code = "UA", code3 = "UKR", callingCodes = listOf("+380"), continents = listOf(Continent.EUROPE)),
  UNITED_ARAB_EMIRATES(code = "AE", code3 = "ARE", callingCodes = listOf("+971"), continents = listOf(Continent.ASIA)),
  URUGUAY(code = "UY", code3 = "URY", callingCodes = listOf("+598"), continents = listOf(Continent.SOUTH_AMERICA)),
  USA(code = "US", code3 = "USA", callingCodes = listOf("+1"), continents = listOf(Continent.NORTH_AMERICA)),
  US_VIRGIN_ISLANDS(code = "VI", code3 = "VIR", callingCodes = listOf("+1340"), continents = listOf(Continent.NORTH_AMERICA)),
  UZBEKISTAN(code = "UZ", code3 = "UZB", callingCodes = listOf("+998"), continents = listOf(Continent.ASIA)),
  VANUATU(code = "VU", code3 = "VUT", callingCodes = listOf("+678"), continents = listOf(Continent.OCEANIA)),
  VATICAN_CITY(code = "VA", code3 = "VAT", callingCodes = listOf("+379"), continents = listOf(Continent.EUROPE)),
  VENEZUELA(code = "VE", code3 = "VEN", callingCodes = listOf("+58"), continents = listOf(Continent.SOUTH_AMERICA)),
  VIETNAM(code = "VN", code3 = "VNM", callingCodes = listOf("+84"), continents = listOf(Continent.ASIA)),
  WALLIS_AND_FUTUNA(code = "WF", code3 = "WLF", callingCodes = listOf("+681"), continents = listOf(Continent.OCEANIA)),
  YEMEN(code = "YE", code3 = "YEM", callingCodes = listOf("+967"), continents = listOf(Continent.ASIA)),
  ZAMBIA(code = "ZM", code3 = "ZMB", callingCodes = listOf("+260"), continents = listOf(Continent.AFRICA)),
  ZIMBABWE(code = "ZW", code3 = "ZWE", callingCodes = listOf("+263"), continents = listOf(Continent.AFRICA)),
  ;

  /** The flag as an Emoji. */
  override val emoji: String get() =
    code.map { "${0xD83C.toChar()}${(0xDDA5 + it.code).toChar()}" }.joinToString("")

  companion object {
    fun fromOrNull(identifier: String?) = when {
      identifier.isNullOrBlank() -> null
      else -> entries.firstOrNull { it.code.equals(identifier, ignoreCase = true) || it.code3.equals(identifier, ignoreCase = true) }
    }

    fun fromLocaleOrNull(locale: String?): Country? {
      val splits = localeSplit(locale)
      return fromOrNull(splits.getOrNull(1))
    }

    /** Tries every possible combination that I know to somehow get a meaningful country. */
    fun fromLenientOrNull(string: String?) = entries.firstOrNull { it.name.equals(string, ignoreCase = true) }
      ?: fromOrNull(string)
      ?: fromLocaleOrNull(string)
  }
}
