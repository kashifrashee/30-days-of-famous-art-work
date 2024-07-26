package com.example.a30daysoffamousartworks.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.a30daysoffamousartworks.R

data class ArtGallery(
    val numberOfDay: Int,
    @StringRes val imageTitleResId: Int,
    @DrawableRes val imageResId: Int,
    @StringRes val imageDescriptionResId: Int,
    @StringRes val workTypeResId: Int,
    @StringRes val dateResId: Int,
    @StringRes val cultureResId: Int,

)

val artGalleryList = listOf(
    ArtGallery(
        1, R.string.art_gallery_title_1, R.drawable.guanyin_pusa, R.string.image_description_1,
        R.string.work_type_1, R.string.date_1, R.string.culture_1
    ),
    ArtGallery(
        2, R.string.art_gallery_title_2, R.drawable.five_views_of_an_elephant_combat, R.string.image_description_2,
        R.string.work_type_2, R.string.date_2, R.string.culture_2
    ),
    ArtGallery(
        3, R.string.art_gallery_title_3, R.drawable.a_prince_receives_a_water_jug_from_a_young_woman_at_a_well, R.string.image_description_3,
        R.string.work_type_3, R.string.date_3, R.string.culture_3
    ),
    ArtGallery(
        4, R.string.art_gallery_title_4, R.drawable.young_man_in_a_blue_cloak, R.string.image_description_4,
        R.string.work_type_4, R.string.date_4, R.string.culture_4
    ),
    ArtGallery(
        5, R.string.art_gallery_title_5, R.drawable.it_s_the_day_for_the_garden,
        R.string.image_description_5, R.string.work_type_5, R.string.date_5, R.string.culture_5
    ),
    ArtGallery(
        6, R.string.art_gallery_title_6, R.drawable.angela, R.string.image_description_6,
        R.string.work_type_6, R.string.date_6, R.string.culture_6
    ),
    ArtGallery(
        7, R.string.art_gallery_title_7, R.drawable.death_with_left_hand_raised,
        R.string.image_description_7, R.string.work_type_7, R.string.date_7, R.string.culture_7
    ),
    ArtGallery(
        8, R.string.art_gallery_title_8, R.drawable.grotesque_head, R.string.image_description_8,
        R.string.work_type_8, R.string.date_8, R.string.culture_8
    ),
    ArtGallery(
        9, R.string.art_gallery_title_9, R.drawable.the_holy_family,
        R.string.image_description_9, R.string.work_type_9, R.string.date_9, R.string.culture_9
    ),
    ArtGallery(
        10, R.string.art_gallery_title_10, R.drawable.mahraja, R.string.image_description_10,
        R.string.work_type_10, R.string.date_10, R.string.culture_10
    ),
    ArtGallery(
        11, R.string.art_gallery_title_11, R.drawable.kneeling_female_figure, R.string.image_description_11,
        R.string.work_type_11, R.string.date_11, R.string.culture_11
    ),
    ArtGallery(
        12, R.string.art_gallery_title_12, R.drawable.king_of_navarre, R.string.image_description_12,
        R.string.work_type_12, R.string.date_12, R.string.culture_12
    ),
    ArtGallery(
        13, R.string.art_gallery_title_13, R.drawable.bar, R.string.image_description_13,
        R.string.work_type_13, R.string.date_13, R.string.culture_13
    ),
    ArtGallery(
        14, R.string.art_gallery_title_14, R.drawable.melencolia, R.string.image_description_14,
        R.string.work_type_14, R.string.date_14, R.string.culture_14
    ),
    ArtGallery(
        15, R.string.art_gallery_title_15, R.drawable.now_, R.string.image_description_15,
        R.string.work_type_15, R.string.date_15, R.string.culture_15
    ),
    ArtGallery(
        16, R.string.art_gallery_title_16, R.drawable.clarinet_in_b_flat, R.string.image_description_16,
        R.string.work_type_16, R.string.date_16, R.string.culture_16
    ),
    ArtGallery(
        17, R.string.art_gallery_title_17, R.drawable.bronze_statuette_of_a_young_woman, R.string.image_description_17,
        R.string.work_type_17, R.string.date_17, R.string.culture_17
    ),
    ArtGallery(
        18, R.string.art_gallery_title_18, R.drawable.bronze_head_of_a_griffin, R.string.image_description_18,
        R.string.work_type_18, R.string.date_18, R.string.culture_18
    ),
    ArtGallery(
        19, R.string.art_gallery_title_19, R.drawable.the_love_song, R.string.image_description_19,
        R.string.work_type_19, R.string.date_19, R.string.culture_19
    ),
    ArtGallery(
        20, R.string.art_gallery_title_20, R.drawable.blue_qur_an, R.string.image_description_20,
        R.string.work_type_20, R.string.date_20, R.string.culture_20
    ),
    ArtGallery(
        21, R.string.art_gallery_title_21, R.drawable.set_of_jewelry, R.string.image_description_21,
        R.string.work_type_21, R.string.date_21, R.string.culture_21
    ),
    ArtGallery(
        22, R.string.art_gallery_title_22, R.drawable.wheat_fields, R.string.image_description_22,
        R.string.work_type_22, R.string.date_22, R.string.culture_22
    ),
    ArtGallery(
        23, R.string.art_gallery_title_23, R.drawable.madonna_and_child, R.string.image_description_23,
        R.string.work_type_23, R.string.date_23, R.string.culture_23
    ),
    ArtGallery(
        24, R.string.art_gallery_title_24, R.drawable.a_pair_of_royal_earrings, R.string.image_description_24,
        R.string.work_type_24, R.string.date_24, R.string.culture_24
    ),
    ArtGallery(
        25, R.string.art_gallery_title_25, R.drawable.fight_the_evil_king, R.string.image_description_25,
        R.string.work_type_25, R.string.date_25, R.string.culture_25
    ),
    ArtGallery(
        26, R.string.art_gallery_title_26, R.drawable.portrait_of_alain_de, R.string.image_description_26,
        R.string.work_type_26, R.string.date_26, R.string.culture_26
    ),
    ArtGallery(
        27, R.string.art_gallery_title_27, R.drawable.the_three_crosses, R.string.image_description_27,
        R.string.work_type_27, R.string.date_27, R.string.culture_27
    ),
    ArtGallery(
        28, R.string.art_gallery_title_28, R.drawable.shah_jahan, R.string.image_description_28,
        R.string.work_type_28, R.string.date_28, R.string.culture_28
    ),
    ArtGallery(
        29, R.string.art_gallery_title_29, R.drawable.bone_book, R.string.image_description_29,
        R.string.work_type_29, R.string.date_29, R.string.culture_29
    ),
    ArtGallery(
        30, R.string.art_gallery_title_30, R.drawable.the_free_man, R.string.image_description_30,
        R.string.work_type_30, R.string.date_30, R.string.culture_30
    )
)
