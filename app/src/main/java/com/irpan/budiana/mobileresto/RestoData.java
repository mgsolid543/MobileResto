package com.irpan.budiana.mobileresto;

import java.util.ArrayList;

public class RestoData {
    private static String[] restoNames = {
            "Bakso Astagfirullah",
            "Iga Bakar Si Jangkung",
            "Chingu Korean Fan Café",
            "Sate & Gule Kambing H.M. Harris",
            "Batagor Kingsley",
            "Kedai Selasih",
            "Martabak San Fransisco",
            "Etcetera Cafe & Resto",
            "Nasi Bancakan Mang Barna & Bi O'om",
            "Roti Gempol"
    };

    private static String[] restoAddress = {
            "Jl. Sukawarna No. 21, Pasteur",
            "Jl. Cipaganti No.75G, Pasteur, Sukajadi, Kota Bandung, Jawa Barat 40161",
            "Jl. Sawunggaling No. 10",
            "Jl. Asia Afrika No. 155",
            "Jl. Veteran No. 25",
            "Jl. Cikutra Baru VI No.34",
            "Jl. Burangrang No. 42",
            "Jl. Trunojoyo No. 40",
            "Jl. Trunojoyo No. 62",
            "Jl. Gempol Wetan No. 14"
    };

    private static String[] restoPhone = {
            "0812-2266-3460",
            "0811 2205513",
            "022 4239963",
            "022 4220717",
            "022 4207104",
            "022 7108165",
            "022 7312192",
            "022 4265154",
            "022 4203650",
            "022 4239469"
    };

    private static String[] restoHour = {
            "10:00-21:00",
            "10:00-22:00",
            "10:00-22:00",
            "10:00-04:00",
            "08:00-20:00",
            "09:00-21:00",
            "11:00-23:00",
            "09:00-23:00",
            "10:00-22:00",
            "07:00-21:00"
    };

    private static String[] restoRate = {
            "4.2/5",
            "5/5",
            "4.2/5",
            "4/5",
            "4/5",
            "4/5",
            "4.1/5",
            "3.9/5",
            "3.9/5",
            "4/5"
    };

    private static String[] restoService = {
            "halal\n" +
                    "outdoor-seats\n" +
                    "smoking-area\n" +
                    "take-away",

            "delivery-service\n" +
                    "halal\n" +
                    "smoking-area\n" +
                    "take-away\n" +
                    "casual-dining",

            "free-wifi\n" +
                    "halal\n" +
                    "outdoor-seats\n" +
                    "smoking-area\n" +
                    "take-away\n" +
                    "vip-room\n" +
                    "casual-dining",


            "delivery-service\n" +
                    "free-wifi\n" +
                    "halal\n" +
                    "outdoor-seats\n" +
                    "smoking-area\n" +
                    "take-away\n" +
                    "vip-room\n" +
                    "serves-alcohol\n" +
                    "sahur\n" +
                    "casual-dining",

            "halal\n" +
                    "smoking-area\n" +
                    "take-away",

            "free-wifi\n" +
                    "halal\n" +
                    "outdoor-seats\n" +
                    "take-away\n" +
                    "casual-dining",
            "halal\n" +
                    "smoking-area\n" +
                    "take-away",
            "free-wifi\n" +
                    "halal\n" +
                    "outdoor-seats\n" +
                    "book-online\n" +
                    "smoking-area\n" +
                    "take-away",
            "free-wifi\n" +
                    "halal\n" +
                    "smoking-area\n" +
                    "take-away\n" +
                    "casual-dining",
            "halal\n" +
                    "outdoor-seats\n" +
                    "smoking-area\n" +
                    "take-away"
    };

    private static String[] restoPrice = {
            ">Rp 35K",
            "<Rp 100K",
            "> Rp 25K",
            "> Rp 25 K",
            "> Rp 10 K",
            "> Rp 15 K",
            "> Rp 45 K",
            "> Rp 25 K",
            "> Rp 15 K",
            "> Rp 10 K"
    };

    private static int[] restoImages = {
            R.drawable.bakso_istigfar,
            R.drawable.iga_bakar,
            R.drawable.chingu,
            R.drawable.sate_harris,
            R.drawable.batagor_kingsley,
            R.drawable.kedai_selasih,
            R.drawable.martabak,
            R.drawable.etcetera,
            R.drawable.nasi_bancakan,
            R.drawable.roti_gempol
    };

    private static String[] restoDetails = {
            "Bakso Laman astagfirullah buka mulai jam 10 pagi dan tutup sekitar jam 10 malam dengan range harga 25.000-150.000 per porsi. Harga yang cukup reasonable dengan apa yang disajikan. Kalau mau traktiran sampai 20 orang, insyaallah muat karena memang kapasitas tempatnya dapat menampung hingga 20 orang dewasa. Parkir motor dan mobil tersedia di sekitar lokasi bakso laman astagfirullah aladzim. Pastikan bawa uang cash sebab hanya menerima pembayaran tunai.\n" +
                    "\n" +
                    "Opsi bakso yang tersedia mah standar tukang bakso pada umumnya: bisa pesan bakso saja, bakso plus bihun, mie bakso ataupun bakso campur mie dan bihun. Ini kembali ke selera masing-masing. Saya sendiri lebih suka bikin bakso. Nikmati dalam “kondisi” original. Lanjut tambahkan sedikit pedas, nikmati. Lanjut kasih saus dan kecap. Jadi sekali makan bisa menikmati 3 sensasi rasa berbeda.\n" +
                    "\n" +
                    "Kalau teman-teman ingat keluarga di rumah, bisa juga kok dibungkus. Tenang saja, harga mah tetep sama kok. Bisa jadi kejutan untuk orang-orang tercinta. Apalagi jika mereka adalah penggemar bakso juga.\n" +
                    "Bagaimana Rasa Bakso Astagfirullah?\n" +
                    "\n" +
                    "Kalau saya, yang pertama kali dinikmati saat menyantap bakso adalah kuahnya. Jika kuahnya enak, bakso yang rasanya biasa bisa terobati. Nah, kalau bakso laman bandung ini sudah mah kuahnya enak, baksonya pun mantap. Endeus kata orang mah. Jadi menikmati sekali\n" +
                    "\n" +
                    "Jika pertama kali datang ke bakso laman astagfirullah Bandung Bersama teman atau keluarga, baiknya pesan 1 porsi dulu saja. Bukan karena ragu jadi kudu nyicip rasa dulu, tapi lebih pada “siapa tahu ga sanggup menghabiskan baso astaghfirullah ini”..",


            "Salah satu Tempat Kuliner di Bandung yang banyak diminati oleh warga bandung dan juga wisatawan selama ini adalah Iga Bakar Si Jangkung Bandung."+
                    "berbagai sajian sedap dan nikmat telah disiapkan di Rumah Makan di Bandung ini, dan siap memanjakan lidah dan memuaskan perut anda semua,\n" +
                    "mulai dari beragam olahan daging iga sapi, kemudian daging ayam dan kambing serta sajian spesial Nasi Goreng dengan racikan daging di atas.\n" +
                    "sesuai dengan namanya, maka hidangan menu terpopuler yang di sediakan rumah makan Iga Bakar Si Jangkung ini adalah Iga Bakar.\n" +
                    "Berbeda dengan menu iga bakar di bandung lainnya yang ada di Bandung, maka hidangan menu makan iga bakar ala Si Jangkung ini disajikan sudah tanpa tulang dalam dihidangkan dalam sebuah hot plate.\n" +
                    "sajian makananannya semakin sedap karena iga bakar ini diolah dengan bumbu serta rempah-rempah yang menghasilakn aroma sedap yang kuat"

            ,
            "Belakangan ini Korea memiliki banyak sekali penggemar di Indonesia. Mulai dari musik, film, sampai makanan Korea pun laris menjadi buruan food hunter. Makanya sekarang nggak susah untuk mencari tempat yang menjual makanan Korea, termasuk di Bandung. Ada yang franchise langsung dari Korea, ada juga merk lokal yang menjual makanan Korea.\n" +
                    "\n" +
                    "Nah, Kalau di Bandung salah satu Korean Food cafe yang lagi ramai didatangi anak muda adalah Chingu Cafe. Targetnya memang mahasiswa, jadi harganya juga ramah banget di kantong mahasiswa. Menu paling mahalnya 29,9ribuan. Nggak hanya murah, konsepnya juga menarik. Begitu masuk kita seperti nggak lagi di Bandung. Korea banget desainnya. Dari tempat menunggunya yang disusun seperti halte, musik dan video klip yang diputar lagu-lagu Korea yang lagi hits, sampai bentuk lesehan ala Korea juga ada disini.\n" +
                    "\n" +
                    "Makanan Korean yg dijual disini halal semua sehingga kaum muslim tidak perlu was-was ketika makan. Katanya, owner dari Chingu Cafe memang pernah tinggal di Korea dan resep makanan di Chingu didapat selama owner tinggal disana. Menunya cukup lengkap, dari Tteobokki, Ramyun, Hotteok, sampai Jap Chaenge juga ada.\n" +
                    "Ambience\n" +
                    "\n" +
                    "Pintu masuknya terbuat dari kaca-kaca dengan tembok bernuansa batu bata putih. Ada ‘pohon kertas’ juga sebagai hiasan di salah satu sudutnya. Kertas-kertas itu berisi pengalaman pengunjung yang datang ke Chingu cafe.\n" +
                    "\n" +
                    "Jika tempatnya penuh dan waiting list, kita bisa menunggu di ‘halte’. Lucu banget ya? Ada poster-poster Korea yang lagi hits juga di dindingnya. Sebenarnya kami juga  bukan penggemar Korea, tapi masuk kesini terasa menyenangkan. Kebayang Korean lovers, pasti lebih happy lagi disini \uD83D\uDE09\n" +
                    "\n" +
                    "Di bagian tengahnya ada bangku-bangku yang disusun seperti duduk di tengah taman. Di setiap dindingnya ada poster film dan artis tersusun dengan rapih. Masuk ke bagian belakang, ada tempat lesehan ala Korea juga. Di dindingnya pun digambar mural Korean artist.\n",


            "Penasaran bagaimana kelezatan dan kelembutan menu daging di sini? Yuk, langsung saja kunjungi Warung Sate dan Gule Kambing H. M. Haris di Jl. Asia Afrika No. 151, Bandung. Lokasinya tak jauh dari menara jam peringatan Konferensi Asia Afrika (KAA), dan berada di kanan jalan. Karena jalan tersebut merupakan jalan satu arah, pastikan agar jangan sampai terlewat saat berkendara.",

            "Jika banyak orang yang menyatakan bahwa Kuliner Bandung seperti batagor itu “Nendang” dan Ngangenin sehingga tidak bosan untuk datang kembali, itu sangat beralasan, kenapa ?\n" +
                    "\n" +
                    "Selain rasanya yang sangat khas, pedasnya yang bikin “Seuhah”, aneka bumbunya pas di lidah, dan off course harganya tuh yang tidak bikin susah alias murah.\n" +
                    "\n" +
                    "Dan salah satu pusat kuliner yang menjual salah satu jenis Makanan Khas Bandung itu adalah Batagor Kingsley.\n" +
                    "\n" +
                    "Setengah matang. Mohon untuk menggoreng produk setelah diterima\n" +
                    "Isi 5 pcs (3 tahu dan 2 siomay)\n" +
                    "Untuk pengiriman Jabodetabek\n" +
                    "Flat ongkir s/d 5Kg\"",

            "\"Kedai makan Selasih memang menjadi \"\"ikon\"\" tersendiri do kota Bandung siring dengan banyaknya pelajar yang menempuh jejang pendidikannya di kota Bandung. Kedai/ cafe Selasih memiliki slogan yang cukup unik, yaitu Serba Ada, Halal dan Bersih. Slogan tersebut adalah hal sederhana yang kita cari ketika mencari makanan di kedai/ resto atau kafe.\n" +
                    "\n" +
                    "Selasih menyasar konsumen dari kalangan mahasiswa dan anak anak muda Bandung. Hal ini konsisten dengan harga yang ditawarkan oleh Selasih ini yang cukup murah. Mulai dari 1rb sampai dengan 50rban saja per porsi makanan dan minumannya. Makanan yang ditawarkan sesuai menu adalah:\n" +
                    "Masakan Timur Tengah\n" +
                    "Masakan Eropa\n" +
                    "Masakan Chinese\n" +
                    "Masakan Indonesia\n" +
                    "lainnya\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "Lokasi kedai makan Selasih asri dengan memadukan rindangnya pohon dengan bangunan terbuka. Ada yang menggunakan model cafe taman, ada juga yang menggunakan konsep seperti kantin pada umumnya. Lokasinya cukup luas, bisa menampung sampai 100an kursi, baik untuk lantai 1 mapun lantai 2. Kedai selasih buka mulai jam 09.00 sampai dengan 22.00, pada saat malam hari, aneka lampu menerangi sehingga suasana menjadi lebih indah.\n" +
                    "\n" +
                    "\n" +
                    "ini dia nih, salah satu menu Eropa yang ada di Selasih. Mungkin salah satu best seller juga untuk makanan eropa, yaitu Sirloin Steik. Pilihan nya, Sirloin Seik dapat dinikmati dengan french fries atau dengan mash potato. Bagi para mahasiswa, menikmati Sirloin Steak tidak harus mahal, mereka bisa mencoba menikmati Sirloin Steak di Selasih ini.\n" +
                    "\n" +
                    "Selain itu, di Selasih ini, anda juga bisa menikmati Pizza, makanan khas italia. Harga yang ditawarkan pun jauh lebih murah dibanding dengan restoran pizza pada umumnya. Ada beberapa jenis topping pizza yang bisa dipesan sesuai dengan selera anda.\n" +
                    "\n" +
                    "\n" +
                    "Masakan Indonesia pun banyak yang bisa dipesan. Diantaranya adalah kangkung cah, ayam cabe hijau, nasi goreng seafood, mie bakso, baso tahu, roti bakar, nasi liwet,Sop buntut, Rawon dan lain lainnya. Harganya tentu saja masuk untuk kalangan mahasiswa dan anak muda.\n" +
                    "\n" +
                    "\n" +
                    "Ini adalah contoh bon tagihan yang dibayarkan untuk menu yang dipesan. Oh iya, disini anda harus bayar dulu untuk menikmati makanan di Selasih ini. hal unik lain yang berbeda dari Selasih ini adalah di Selasih disediain Air putih yang bisa kita minum sepuasnya, jadi bisa ngirit duit.\n" +
                    "\n" +
                    "Rute angkot terdekat : caheum-ciroyom, binong atau gedebage-simpang dago.\n" +
                    "Dekat Selasih terdapat beberapa kampus, diantaranya kampus UPI (fakultas olahraga), Univ. Widyatama, ITENAS, Univ. Sangga Buana, STMIK Bdg, STIE Ekuitas.Lokasinya juga berada deket GOR C-TRA Arena.\"",

            "Hari ini mau makan di mana? Nah kalau masih bingung, di Lapangan PPI Pussenif ada acara Pucuk Coolinary Festival yang siap memanjakan lidah dengan 100 tenan kuliner juara khas Bandung.\n" +
                    "\n" +
                    "Di antara hiruk pikuk hajatan kuliner terbesar di Indonesia ini, pengunjung tetap saja memadati tenan klasik loh. Salah satunya Martabak San Francisco yang menebar kelezatan sejak 1967 atau mencapai 51 tahun!\n" +
                    "\n" +
                    "Pemilik martabak legendaris Iyang bercerita, enggak cuma laris diburu saat acara kuliner, martabak klasik juga tetap diincar penikmatnya dari mulai anak milenial sampai oma dan opa yang sudah lebih dulu kenal San Francisco.\n" +
                    "\n" +
                    "\"\"Sekarang kan zamannya martabak kekinian, dengan topping hit seperti Nuttela, Ovalmaltine. Uniknya, martabak kacang cokelat dan martabak telur isi sapi tetap jafo favorit,\"\" ujar Iyang kepada BeritaBaik.\n" +
                    "\n" +
                    "Baca Ini Juga Yuk: Doyan Jajan? Siap-Siap Nih Ada Festival Kuliner di Akhir Pekan\n" +
                    "\n" +
                    "Apa sih yang membuat martabak ini selalu diburu? TemanBaik amati deh, martabak telurnya berlimpah daging sapi asli yang super empuk dan tanpa lemak. Demikian juga dengan kulit dan racikan bumbunya yang gurih namun enggak bikin eneg. Menurut Iyang, resep warisan ini yang sejak dulu dipertahankan.\n" +
                    "\n" +
                    "\"\"Orang-orang fanatik sama martabak San Franscisco karena tampilannya yang montok dan tebal. Jadi saat dikudap juga puas dan mengenyangkan,\"\" katanya.\n" +
                    "\n" +
                    "Satu dus martabak telur ini dipatok antara Rp 60 ribu sampai Rp 125 ribu. Nah kalau yang manis mulai dari Rp 45 ribu per dus. Catat ya TemanBaik, martabak San Franscisco yang asli ada di Jalan Burangrang Bandung. Hmm... tergiur?\"",

            "Terletak di Jalan Trunojoyo, tidak jauh dari Gedung Sate Bandung, Kafe Etcetera memiliki konsep fine-dining ala Eropa, menu-menunya hampir semua merupakan olahan Steak dari bermacam – macam bahan baku seperti daging sapi, kambing, dan salmon. Menu favorit MJ di tempat ini adalah kowboy steak, steak yang ukuran sangat jombo serta Popeye Steak yaitu steak yang ditemani sayur bayam yang membuat lidah tidak berhenti bergoyang.\n" +
                    "\n" +
                    "Steak etcetera bandung (6)\n" +
                    "\n" +
                    "Harga steak di Kafe etcetera berkisar di angka Rp. 50.000 bro n sis… ada rupa ada harga tentunya tapi yang pasti setelah icip-icip bro n sis tidak akan rugi dengan harga yang ditawarkan.\n" +
                    "\n" +
                    "Namun selain steak terdapat juga menu lainnya yang bisa bro n sis pilih seperti spagetti, french fries, dan drum chicken stick.\n" +
                    "\n" +
                    "Kalau kebetulan bro n sis berkunjung ke Kota Bandung, Steak di Kafe Etcetera bisa jadi salah satu tempat makan yang patut bro n sis kunjungi terlebih dengan tempatnya yang nyaman membuat bro n sis bisa betah untuk mengobrol lama di tempat yang satu ini.\"",

            "Sejumlah Tempat wisata kuliner di Bandung memang dikenal sebagai surga wisata bagi pecinta wisata perut atau lidah.Tercatat banyak sekali tempat makan enak dan unik di bandung yang menawarkan daya tariknya masing-masing, mulai dari cita rasa kulinernya, design bangunan baik interior dan eksteriornya, cara makannya, lokasi tempatnya hingga harga yang ditawarkannya sangat beragam.Nah, salah satu tempat kuliner khas bandung yang menawarkan konsep berbeda itu adalah populer dengan nama Nasi Bancakan di Jalan Trunojoyo Bandung punya mang Barna dan Bi O’om.\n" +
                    "\n" +
                    "Hai sahabat traveler’s, jumpa lagi dengan saya, penulis blog info tempat wisata di bandung, yang akan selalu mengupdate informasi seputar wisata bandung kepada anda. Termasuk kali ini saya ingin memberikan review berupa info salah satu restoran di bandung yang menawarkan sensasi berbeda dan unik berupa tempat makan bernuansa tradisional di kampung halaman bandung, resto nasi bancakan bandung Mang Barna dan Bi O’om.\n" +
                    "\n" +
                    "\n" +
                    " \n" +
                    "Nah seperti apa keistimewaan serta daya tarik dari nasi bancakan khas kota bandung ini, sehingga anda wajib untuk mengunjunginya ketika liburan ke bandung ? kita akan membahasnya di bawah, tapi sebelumnya saya juga mau berikan rekomendasi terbaik beberapa pusat wisata kuliner bandung lainnya yang sudah saya tuliskan dan anda wajib membacanya juga, yaitu cara makan unik di atas daun ala resto alas daun, wisata kuliner ekstrim bandung hingga wisata kuliner di atas bus ala street gourmet.\n" +
                    "\n" +
                    "Daftar Isi\t\n" +
                    "Nasi Bancakan Bandung\n" +
                    "Menu Nasi Bancakan Bandung\n" +
                    "Daftar Harga Nasi Bancakan Bandung\n" +
                    "Alamat Nasi Bancakan Bandung\n" +
                    "Nomer Telepon Nasi Bancakan Bandung\n" +
                    "Jam Buka Nasi Bancakan Bandung\n" +
                    "Peta Lokasi Nasi Bancakan Bandung\n" +
                    "Nasi Bancakan Bandung\n" +
                    "Nasi Bancakan Bandung\n" +
                    "Nasi Bancakan Bandung\n" +
                    "Sahabat traveler’s pecinta kuliner bandung, resto Nasi Bancakan memang merupakan tempat makan yang menawarkan daya tarik kepada pengunjungnya berupa tradisi kuliner sunda yang identik menggambarkan cara makan di kampung halaman Bandung “zaman baheula” atau tempo dulu yang jadoel dan memberi kesan kampungan dan berbeda dengan resto kebanyakan lainnya di bandung yang justru berlomba tampil dengan kesan modern dan kekinian.\n" +
                    "\n" +
                    "Nah, jika anda mau seru-seruan berwisata kuliner ketika ke kota bandung bersama teman atau keluarga, tak cukup anda jika hanya pernah singgah menikmati kuliner lezat di tempat makan romantis di bandung saja, jika anda rindu dan kangen dengan suasana makan serta menu makanan dan minuman ala kampoeng tempo doeloe khas sunda, ya silahkan anda datang ke nasi bancakan bandung mang barna dan bi O’om di jalan trunojoyo no 62 kota bandung.\n" +
                    "\n" +
                    "Sahabat traveler’s,lokasinya di pusat kota bandung, menjadikan nasi bancakan jalan trunojoyo bandung ini sangat mudah anda datangi dan cocok jika dijadikan tempat makan jika perut anda lapar setelah mengunjungi berbagai tempat rekreasi di kota bandung yang terkenal seperti trans studio bandung atau berbelanja di pasar baru trade centre hingga sehabis jalan-jalan di jalan bandung tempo doelo di jalan Braga.\n" +
                    "\n" +
                    "Sahabat traveler’s, jika pertama kali anda mengunjungi lokasi nasi bancakan bandung ala mang barna dan bi o’om di jalan trunojoyo ini, maka kesan pertama yang akan anda lihat dari design atau model bangunan restonya sudah akan sangat terasa, anda seperti akan memasuki suasana rumah kampoeng zaman dulu yang sangat tradisional banget khas sunda, tapi justru inilah kesan yang hendak diciptakan dan ditawarkan pengelola bagi anda.\n" +
                    "\n" +
                    "Nah, belum habis di design bangunan yang unik dan jauh dari kesan sebuah tempat makan seperti resto modern bandung, begitu anda memasuki resto nasi bancakan bandung ini pun anda akan semakin larut dengan suasana “ndeso” alias susana kampungan.Ruangan yang tidak berpendingin kipas atau AC, tidak ada ornamen interior yang aneh-aneh dan modern, karena yang ada adalah hanya hiasan anyaman bambu, lampu petromak serta pernak-pernik yang akan semakin menguatkan bahwa anda benar-benar sedang berada di rumah makan zaman dulu yang jauh dari kesan modern.\n" +
                    "\n" +
                    "Rasa heran dan kaget anda bisa jadi belum habis sampai di situ saja. Di dalam ruangan resto nasi bancakan jalan trunojoyo bandung ini, semua pelayan yang ramah-ramah dan selalu tersenyum ini pun siap menyambut dan melayani anda untuk menikmati aneka hidangan di sana menggunakan pakaian dan bahasa sunda.nah lho ? tapi tidak usah khawatir, mereka juga bisa bahasa indonesia koq.Dan yang unik,di sana ada banner berupa kata-kata papatah berbahasa sunda yang rutin diganti.\n" +
                    "\n" +
                    "Nasi Bancakan Bandung\n" +
                    "Nasi Bancakan Bandung\n" +
                    "Apakah ada lagi yang unik dari nasi bancakan tradisi di kampung halaman bandung mang barna dan bi O’om ini ? yup, benar sekali masih banyak kesan “kampungan” yang akan anda rasakan di sana, tapi justru penulis jamin, ketika datang ke sini, anda benar-benar akan mendapatkan kesan yang sangat benar-benar berbeda dan bisa jadi akan memberi pemgalaman kuliner yang tidak bisa anda lupakan, seperti misalnya yang unik lainnya dari resto ini adalah alas makannya menggunakan piring seng model jadoel, termasuk gelas hingga tempat penyajian hidangan prasmanan seperti baskom seng besar, dan lebih uniknya cara memasak semua makanan di sini menggunakan tungku besar berbahan bakar kayu bakar.\n" +
                    "\n" +
                    "Nah bagaimana sahabat ? penasaran bukan ? jadi mulai sekarang, siapkan anda jika suatu hari di akhir pekan atau musim libur panjang anda berlibur ke kota berjuluk paris van java ini, tidak salah jika anda mencoba sensasi kuliner yang full ingin memberi kesan yang berbeda kepada anda, yaitu sensasi kampungan, jadoel dan ndeso khas sunda, namun tentunya dari rasa dan pelayanan tidak kampungan dong.\n" +
                    "\n" +
                    "Menu Nasi Bancakan Bandung\n" +
                    "Menu Nasi Bancakan Bandung\n" +
                    "Menu Nasi Bancakan Bandung\n" +
                    "Nah sahabat traveler’s, jika anda sudah disuguhkan dengan keunikan di atas yang sepertinya cukup sulit anda temukan tempat ke dua yang akan memberikan sensasi tradisional ala nasi bancakan bandung di jalan trunojoyo milik mang barna dan Bi O’om ini, maka apa saja sih menu andalan kuliner dari resto khas sunda di bandung ini ?\n" +
                    "\n" +
                    "Sahabat, menu makanan dan minuman di resto nasi bancakan bandung yang dekat dengan rumah makan sambara bandung ini sangat beragam, namun sekali lagi saya mau tegaskan, hingga menu kuliner nya pun anda siap disambut dengan berbagai menu makanan dan minuman khas sunda yang tradisional. Soal rasa bagaimana ? wow, jangan salah, anda pecinta makanan yang enak dan lezat citarasa tradisional sunda, inilah tempatnya.\n" +
                    "\n" +
                    "Berbagai menu makanan khas sunda seperti nasi liwet, nasi timbel, abon, paru, tahu bandung, pindang bandeng, ayam goreng, sayur asem, aneka pepes ikan dan daging, perkedel. Masih mau menu makanan yang lebih aneh dan anda pasti belum mendengar apalagi mencicipinya, tapi sangat enak lho, yaitu gejos cabe hejo, tumis lember, tumis suung. Bagimana dengan minumannya ? wow, anda wajib mencicipinya, di sini ada es kopi nyereng, jus terong, es goyobod, bandrek hingga es cingcaw.\n" +
                    "\n" +
                    "Sahabat traveler’s, penyajian makanan dan minuman di sini menggunakan cara parasmanan atau bahasa gaulnya zaman sekarang melayani sendiri, anda bebas memilih aneka makanan dan minuman yang tersadi di meja hidangan sesuai selera anda, tapi tentunya sesudahnya anda harus membayar, hehehe.Untuk tempat makan dan minumnya, anda bisa memilih mau duduk di kursi atau lesehan juga tersedia, pokonya benar-benar siap memberi kenyamanan bagi anda.\n" +
                    "\n" +
                    "Satu lagi yang spesial jika anda makan di nasi bancakan bandung Mang Barna dan Bi O’om di jalan trunojoyo no 62 ini adalah, setelah selesai makan makanan yang berat, maka di sini anda bisa menemukan cemilan manis berupa jajanan kampung khas bandung yang terbuat dari gula merah seperti kue balok yang rasanya khas dan lezat. Dijamin tujuan awalnya cicip-cicip, maka sebelum pulang anda akan memesan dan membawa kue balok ini sebagai oleh-oleh khas bandung.\n" +
                    "\n" +
                    "Daftar Harga Nasi Bancakan Bandung\n" +
                    "Daftar Harga Menu Nasi Bancakan Bandung\n" +
                    "Daftar Harga Menu Nasi Bancakan Bandung\n" +
                    "Nah sahabat traveler’s, jika di atas anda sudah tahu menu apa saja yang ada di resto nasi bancakan bandung mang barna dan Bi O’om , pasti anda bertanya berapa sih harga makanan dan minuman yang tersedia di sana bukan ? Berbicara soal harga makanan, maka penulis jawab, inilah salah satu tempat makan enak dan murah yang ada di tengah kota Bandung.\n" +
                    "\n" +
                    "Coba saja anda bayangkan, untuk harga manakan di nasi bancakan bandung ini, hanya dengan harga mulai Rp.5.000, anda sudah bisa menikmati makanan lezat bercita rasa tradisonal yang sudah nyaris langka dan sulit anda dapatkan di banyak tempat.Bahkan untuk harga minumannya nya pun yang dijamin bisa menyegarkan tubuh anda, bisa anda dapatkan dengan mulai harga hanya Rp.1.500 saja, murah sekali bukan ?\"",

            "Pencinta roti klasik wajib mampir ke Roti Gempol saat ke Bandung. Tersedia roti gandum berisi ragam olesan yang bisa dinikmati dalam porsi perseorangan atau besar. Yuk, mampir!\n" +
                    "\n" +
                    "Di Bandung ada beberapa bakery atau toko roti legendaris yang sudah bertahan puluhan tahun. Kenikmatannya teruji zaman hingga tetap populer hingga sekarang. Sebut saja roti buatan Sumber Hidangan dan Braga Permai di Jalan Braga yang sudah ada masing-masing sejak tahun 1929 dan 1918.\n" +
                    "\n" +
                    "Nah, di Jalan Gempol Wetan yang padat dengan pemukiman penduduk, ada toko roti klasik bernama Roti Gempol yang juga populer. Lokasinya di dekat Pasar Gempol dan di dalam gang sempit. Buka setiap hari mulai pukul 7 pagi, banyak pengunjung antre untuk sarapan roti gandum yang sudah ada sejak tahun 1958 ini.\n" +
                    "\n" +
                    "Roti Gempol: Empuk Wangi Roti Gandum Srikaya Cokelat yang Legendaris\n" +
                    "\n" +
                    "Foto: dok. detikFood\n" +
                    "\n" +
                    "Sekilas bangunan Roti Gempol tak ubahnya dua rumah yang digabung jadi satu. Interiornya didominasi kayu dengan warna cokelat klasik. Rumah pertama dijadikan area pembuatan dan pemanggangan roti. Sedangkan rumah kedua fokus untuk menawarkan olahan roti.\n" +
                    "\n" +
                    "Baca juga: Toko Roti Jadul Puluhan Tahun Ini Masih Jual Roti Hangat Tiap Hari\n" +
                    "\n" +
                    "detikFood berbincang dengan salah seorang pegawai Roti Gempol. Ia menuturkan dalam sehari bisa membuat 500 loaf roti gandum. Berbeda dari roti gandum modern, roti gandum di sini dibuat tanpa bahan pengawet dan bisa bertahan hingga 3 hari. Serat-serat gandumnya terbilang lebih kasar. Selain roti gandum, mereka juga menjajakan roti putih.\n" +
                    "\n" +
                    "Roti Gempol: Empuk Wangi Roti Gandum Srikaya Cokelat yang LegendarisFoto: dok. detikFood\n" +
                    "\n" +
                    "Penggemar roti bisa mencicip roti bakar fresh berbahan roti gandum atau roti putih khas Roti Gempol. Menunya dibedakan dalam kategori ukuran dan isian. Ukurannya tersedia untuk perseorangan atau besar (ririungan). Sedangkan untuk isian ada pilihan manis atau gurih.\n" +
                    "\n" +
                    "Untuk kategori rasa manis bisa dicampur hingga maksimal 3 rasa. Pilihannya antara lain cokelat, susu, kacang, nanas, dan strawberry. Untuk kategori asin tersedia pilihan telur, daging, dan keju. Harga roti bakar di sini berkisar dari Rp 11.000 hingga Rp 22.000 untuk kategori roti bakar perseorangan.\n" +
                    "\n" +
                    "Usai memesan, kami bisa mengintip proses pembakaran roti di area depan toko. Sekitar 3 orang pegawai sigap mengoles, memanggang, hingga menambahkan isian ke dalam roti bakar. Datang di pagi hari ketika akhir pekan, kami harus menunggu antrean sekitar 1 jam.\n" +
                    "\n" +
                    "Roti Gempol: Empuk Wangi Roti Gandum Srikaya Cokelat yang LegendarisFoto: dok. detikFood\n" +
                    "\n" +
                    "Lelah antre kami terbayar ketika pesanan Manis Gandum Ririungan Srikaya, Cokelat, Susu (Rp 35.000) datang. Ririungan ternyata berporsi besar, sampai-sampai disajikan dalam dua piring. Terlihat permukaan roti bakar berwarna cokelat keemasan. Serat-serat gandumnya lumayan terlihat jelas.\n" +
                    "\n" +
                    "Nyamm! Roti gandum terasa renyah di luar, namun tetap empuk dan lembut di dalam. Olesan selai srikaya, cokelat, dan susu berpadu jadi satu hingga konsistensinya kental dan agak luber. Rasa manis legitnya benar-benar puaskan selera! Tercecap selai srikaya sebagai rasa manis paling dominan.\n" +
                    "\n" +
                    "Roti Gempol: Empuk Wangi Roti Gandum Srikaya Cokelat yang LegendarisFoto: dok. detikFood\n" +
                    "\n" +
                    "Puas dengan yang manis, kami mencicip Komplet Gandum Perseorangan Daging, Telur, Keju (Rp 22.000). Menu ini sama-sama memakai roti gandum, hanya saja isiannya gurih. Dagingnya berupa lembaran smoked beef. Untuk telurnya dibuat mata sapi yang sudah digoreng lebih dulu sebelum dijadikan isian roti bakar. Makin enak saat dimakan bersama cocolan saus sambal.\n" +
                    "\n" +
                    "Terakhir, kami mencicip Manis Putih Perseorangan Cokelat Keju (Rp 14.000). Dibanding roti gandum, roti putih di sini tak terlalu istimewa meski teksturnya juga empuk. Paduan manisnya meisjes cokelat dan gurihnya parutan keju cheddar terasa nikmat. Cocok untuk penggemar roti manis gurih.\n" +
                    "\n" +
                    "Roti Gempol: Empuk Wangi Roti Gandum Srikaya Cokelat yang LegendarisFoto: dok. detikFood\n" +
                    "\n" +
                    "Menilik sejarahnya, konon Roti Gempol awalnya berdiri di Salatiga. Barulah tahun 1991, penjualnya yang bernama Ibu Lidya pindah berjualan di Bandung karena ia kuliah di ITB. Sejak saat itu Roti Gempol tak pernah sepi peminat karena terkenal enak. Kalau tak percaya, Anda bisa membuktikan kelezatannya sendiri!\""

    };



    static ArrayList<Resto> getListData() {
        ArrayList<Resto> list = new ArrayList<>();
        for (int position = 0; position < restoNames.length; position++) {
            Resto resto = new Resto();
            resto.setName(restoNames[position]);
            resto.setDetail(restoDetails[position]);
            resto.setPhoto(restoImages[position]);
            resto.setAddress(restoAddress[position]);
            resto.setHour(restoHour[position]);
            resto.setPhone(restoPhone[position]);
            resto.setPrice(restoPrice[position]);
            resto.setRate(restoRate[position]);
            resto.setService(restoService[position]);
            list.add(resto);
        }
        return list;
    }
}
