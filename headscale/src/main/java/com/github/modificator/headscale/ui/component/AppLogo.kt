@file:OptIn(ExperimentalAnimationGraphicsApi::class)

package com.github.modificator.headscale.ui.component

import androidx.compose.animation.graphics.ExperimentalAnimationGraphicsApi
import androidx.compose.animation.graphics.res.animatedVectorResource
import androidx.compose.animation.graphics.res.rememberAnimatedVectorPainter
import androidx.compose.animation.graphics.vector.AnimatedImageVector
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.tooling.preview.Preview
import com.github.modificator.headscale.R


@Preview
@Composable
fun RegisterHeadScaleLogo() {
    val image = AnimatedImageVector.animatedVectorResource(R.drawable.ic_register_logo)
    val atEnd by remember { mutableStateOf(false) }
    Icon(
        painter = rememberAnimatedVectorPainter(image, atEnd),
        contentDescription = null, // decorative element
    )
}