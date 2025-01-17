package com.cursedcauldron.wildbackport.client.animation;

import com.cursedcauldron.wildbackport.client.animation.api.Animation;
import com.cursedcauldron.wildbackport.client.animation.api.AnimationHelper;
import com.cursedcauldron.wildbackport.client.animation.api.Keyframe;
import com.cursedcauldron.wildbackport.client.animation.api.Transformation;

public class FrogAnimations {
    public static final Animation CROAKING
        = Animation.Builder.create(4.5F)
              .looping()
              .addBoneAnimation(
                  "croaking_body",
                  new Transformation(
                      Transformation.Targets.TRANSLATE,
                      new Keyframe(
                          0.6667F,
                          AnimationHelper.translate(0.0F, 0.0F, 0.0F),
                          Transformation.Interpolations.LINEAL
                      ),
                      new Keyframe(
                          0.7083F,
                          AnimationHelper.translate(0.0F, 1.0F, 0.0F),
                          Transformation.Interpolations.LINEAL
                      ),
                      new Keyframe(
                          3.2083F,
                          AnimationHelper.translate(0.0F, 1.0F, 0.0F),
                          Transformation.Interpolations.LINEAL
                      ),
                      new Keyframe(
                          3.25F,
                          AnimationHelper.translate(0.0F, 0.0F, 0.0F),
                          Transformation.Interpolations.LINEAL
                      )
                  )
              )
              .addBoneAnimation(
                  "croaking_body",
                  new Transformation(
                      Transformation.Targets.SCALE,
                      new Keyframe(
                          0.6667F,
                          AnimationHelper.scale(1.0F, 1.0F, 1.0F),
                          Transformation.Interpolations.LINEAL
                      ),
                      new Keyframe(
                          0.7083F,
                          AnimationHelper.scale(1.0F, 1.0F, 1.0F),
                          Transformation.Interpolations.LINEAL
                      ),
                      new Keyframe(
                          0.7917F,
                          AnimationHelper.scale(1.3F, 2.1F, 1.6F),
                          Transformation.Interpolations.LINEAL
                      ),
                      new Keyframe(
                          0.875F,
                          AnimationHelper.scale(1.3F, 2.1F, 1.6F),
                          Transformation.Interpolations.LINEAL
                      ),
                      new Keyframe(
                          0.9583F,
                          AnimationHelper.scale(1.0F, 1.0F, 1.0F),
                          Transformation.Interpolations.LINEAL
                      ),
                      new Keyframe(
                          2.5F,
                          AnimationHelper.scale(1.0F, 1.0F, 1.0F),
                          Transformation.Interpolations.LINEAL
                      ),
                      new Keyframe(
                          2.5833F,
                          AnimationHelper.scale(1.3F, 2.1F, 1.6F),
                          Transformation.Interpolations.LINEAL
                      ),
                      new Keyframe(
                          2.6667F,
                          AnimationHelper.scale(1.3F, 2.1F, 1.6F),
                          Transformation.Interpolations.LINEAL
                      ),
                      new Keyframe(
                          2.75F,
                          AnimationHelper.scale(1.0F, 1.0F, 1.0F),
                          Transformation.Interpolations.LINEAL
                      ),
                      new Keyframe(
                          2.8333F,
                          AnimationHelper.scale(1.0F, 1.0F, 1.0F),
                          Transformation.Interpolations.LINEAL
                      ),
                      new Keyframe(
                          2.9167F,
                          AnimationHelper.scale(1.3F, 2.1F, 1.6F),
                          Transformation.Interpolations.LINEAL
                      ),
                      new Keyframe(
                          3.125F,
                          AnimationHelper.scale(1.3F, 2.1F, 1.8F),
                          Transformation.Interpolations.LINEAL
                      ),
                      new Keyframe(
                          3.2083F,
                          AnimationHelper.scale(1.0F, 1.0F, 1.0F),
                          Transformation.Interpolations.LINEAL
                      ),
                      new Keyframe(
                          3.25F,
                          AnimationHelper.scale(1.0F, 1.0F, 1.0F),
                          Transformation.Interpolations.LINEAL
                      )
                  )
              )
              .build();

    public static final Animation WALKING
        = Animation.Builder.create(1.25F)
              .looping()
              .addBoneAnimation(
                  "left_arm",
                  new Transformation(
                      Transformation.Targets.ROTATE,
                      new Keyframe(
                          0.0F,
                          AnimationHelper.rotation(0.0F, -5.0F, 0.0F),
                          Transformation.Interpolations.LINEAL
                      ),
                      new Keyframe(
                          0.2917F,
                          AnimationHelper.rotation(7.5F, -2.67F, -7.5F),
                          Transformation.Interpolations.LINEAL
                      ),
                      new Keyframe(
                          0.625F,
                          AnimationHelper.rotation(0.0F, 0.0F, 0.0F),
                          Transformation.Interpolations.LINEAL
                      ),
                      new Keyframe(
                          0.7917F,
                          AnimationHelper.rotation(22.5F, 0.0F, 0.0F),
                          Transformation.Interpolations.LINEAL
                      ),
                      new Keyframe(
                          1.125F,
                          AnimationHelper.rotation(-45.0F, 0.0F, 0.0F),
                          Transformation.Interpolations.LINEAL
                      ),
                      new Keyframe(
                          1.25F,
                          AnimationHelper.rotation(0.0F, -5.0F, 0.0F),
                          Transformation.Interpolations.LINEAL
                      )
                  )
              )
              .addBoneAnimation(
                  "left_arm",
                  new Transformation(
                      Transformation.Targets.TRANSLATE,
                      new Keyframe(
                          0.0F,
                          AnimationHelper.translate(0.0F, 0.1F, -2.0F),
                          Transformation.Interpolations.LINEAL
                      ),
                      new Keyframe(
                          0.2917F,
                          AnimationHelper.translate(-0.5F, -0.25F, -0.13F),
                          Transformation.Interpolations.LINEAL
                      ),
                      new Keyframe(
                          0.625F,
                          AnimationHelper.translate(-0.5F, 0.1F, 2.0F),
                          Transformation.Interpolations.LINEAL
                      ),
                      new Keyframe(
                          0.9583F,
                          AnimationHelper.translate(0.5F, 1.0F, -0.11F),
                          Transformation.Interpolations.LINEAL
                      ),
                      new Keyframe(
                          1.25F,
                          AnimationHelper.translate(0.0F, 0.1F, -2.0F),
                          Transformation.Interpolations.LINEAL
                      )
                  )
              )
              .addBoneAnimation(
                  "right_arm",
                  new Transformation(
                      Transformation.Targets.ROTATE,
                      new Keyframe(
                          0.0F,
                          AnimationHelper.rotation(0.0F, 0.0F, 0.0F),
                          Transformation.Interpolations.LINEAL
                      ),
                      new Keyframe(
                          0.125F,
                          AnimationHelper.rotation(22.5F, 0.0F, 0.0F),
                          Transformation.Interpolations.LINEAL
                      ),
                      new Keyframe(
                          0.4583F,
                          AnimationHelper.rotation(-45.0F, 0.0F, 0.0F),
                          Transformation.Interpolations.LINEAL
                      ),
                      new Keyframe(
                          0.625F,
                          AnimationHelper.rotation(0.0F, 5.0F, 0.0F),
                          Transformation.Interpolations.LINEAL
                      ),
                      new Keyframe(
                          0.9583F,
                          AnimationHelper.rotation(7.5F, 2.33F, 7.5F),
                          Transformation.Interpolations.LINEAL
                      ),
                      new Keyframe(
                          1.25F,
                          AnimationHelper.rotation(0.0F, 0.0F, 0.0F),
                          Transformation.Interpolations.LINEAL
                      )
                  )
              )
              .addBoneAnimation(
                  "right_arm",
                  new Transformation(
                      Transformation.Targets.TRANSLATE,
                      new Keyframe(
                          0.0F,
                          AnimationHelper.translate(0.5F, 0.1F, 2.0F),
                          Transformation.Interpolations.LINEAL
                      ),
                      new Keyframe(
                          0.2917F,
                          AnimationHelper.translate(-0.5F, 1.0F, 0.12F),
                          Transformation.Interpolations.LINEAL
                      ),
                      new Keyframe(
                          0.625F,
                          AnimationHelper.translate(0.0F, 0.1F, -2.0F),
                          Transformation.Interpolations.LINEAL
                      ),
                      new Keyframe(
                          0.9583F,
                          AnimationHelper.translate(0.5F, -0.25F, -0.13F),
                          Transformation.Interpolations.LINEAL
                      ),
                      new Keyframe(
                          1.25F,
                          AnimationHelper.translate(0.5F, 0.1F, 2.0F),
                          Transformation.Interpolations.LINEAL
                      )
                  )
              )
              .addBoneAnimation(
                  "left_leg",
                  new Transformation(
                      Transformation.Targets.ROTATE,
                      new Keyframe(
                          0.0F,
                          AnimationHelper.rotation(0.0F, 0.0F, 0.0F),
                          Transformation.Interpolations.LINEAL
                      ),
                      new Keyframe(
                          0.1667F,
                          AnimationHelper.rotation(0.0F, 0.0F, 0.0F),
                          Transformation.Interpolations.LINEAL
                      ),
                      new Keyframe(
                          0.2917F,
                          AnimationHelper.rotation(45.0F, 0.0F, 0.0F),
                          Transformation.Interpolations.LINEAL
                      ),
                      new Keyframe(
                          0.625F,
                          AnimationHelper.rotation(-45.0F, 0.0F, 0.0F),
                          Transformation.Interpolations.LINEAL
                      ),
                      new Keyframe(
                          0.7917F,
                          AnimationHelper.rotation(0.0F, 0.0F, 0.0F),
                          Transformation.Interpolations.LINEAL
                      ),
                      new Keyframe(
                          1.25F,
                          AnimationHelper.rotation(0.0F, 0.0F, 0.0F),
                          Transformation.Interpolations.LINEAL
                      )
                  )
              )
              .addBoneAnimation(
                  "left_leg",
                  new Transformation(
                      Transformation.Targets.TRANSLATE,
                      new Keyframe(
                          0.0F,
                          AnimationHelper.translate(0.0F, 0.1F, 1.2F),
                          Transformation.Interpolations.LINEAL
                      ),
                      new Keyframe(
                          0.1667F,
                          AnimationHelper.translate(0.0F, 0.1F, 2.0F),
                          Transformation.Interpolations.LINEAL
                      ),
                      new Keyframe(
                          0.4583F,
                          AnimationHelper.translate(0.0F, 2.0F, 1.06F),
                          Transformation.Interpolations.LINEAL
                      ),
                      new Keyframe(
                          0.7917F,
                          AnimationHelper.translate(0.0F, 0.1F, -1.0F),
                          Transformation.Interpolations.LINEAL
                      ),
                      new Keyframe(
                          1.25F,
                          AnimationHelper.translate(0.0F, 0.1F, 1.2F),
                          Transformation.Interpolations.LINEAL
                      )
                  )
              )
              .addBoneAnimation(
                  "right_leg",
                  new Transformation(
                      Transformation.Targets.ROTATE,
                      new Keyframe(
                          0.0F,
                          AnimationHelper.rotation(-33.75F, 0.0F, 0.0F),
                          Transformation.Interpolations.LINEAL
                      ),
                      new Keyframe(
                          0.0417F,
                          AnimationHelper.rotation(-45.0F, 0.0F, 0.0F),
                          Transformation.Interpolations.LINEAL
                      ),
                      new Keyframe(
                          0.1667F,
                          AnimationHelper.rotation(0.0F, 0.0F, 0.0F),
                          Transformation.Interpolations.LINEAL
                      ),
                      new Keyframe(
                          0.7917F,
                          AnimationHelper.rotation(0.0F, 0.0F, 0.0F),
                          Transformation.Interpolations.LINEAL
                      ),
                      new Keyframe(
                          0.9583F,
                          AnimationHelper.rotation(45.0F, 0.0F, 0.0F),
                          Transformation.Interpolations.LINEAL
                      ),
                      new Keyframe(
                          1.25F,
                          AnimationHelper.rotation(-33.75F, 0.0F, 0.0F),
                          Transformation.Interpolations.LINEAL
                      )
                  )
              )
              .addBoneAnimation(
                  "right_leg",
                  new Transformation(
                      Transformation.Targets.TRANSLATE,
                      new Keyframe(
                          0.0F,
                          AnimationHelper.translate(0.0F, 1.14F, 0.11F),
                          Transformation.Interpolations.LINEAL
                      ),
                      new Keyframe(
                          0.1667F,
                          AnimationHelper.translate(0.0F, 0.1F, -1.0F),
                          Transformation.Interpolations.LINEAL
                      ),
                      new Keyframe(
                          0.7917F,
                          AnimationHelper.translate(0.0F, 0.1F, 2.0F),
                          Transformation.Interpolations.LINEAL
                      ),
                      new Keyframe(
                          1.125F,
                          AnimationHelper.translate(0.0F, 2.0F, 0.95F),
                          Transformation.Interpolations.LINEAL
                      ),
                      new Keyframe(
                          1.25F,
                          AnimationHelper.translate(0.0F, 1.14F, 0.11F),
                          Transformation.Interpolations.LINEAL
                      )
                  )
              )
              .addBoneAnimation(
                  "body",
                  new Transformation(
                      Transformation.Targets.ROTATE,
                      new Keyframe(
                          0.0F,
                          AnimationHelper.rotation(0.0F, 5.0F, 0.0F),
                          Transformation.Interpolations.LINEAL
                      ),
                      new Keyframe(
                          0.2917F,
                          AnimationHelper.rotation(-7.5F, 0.33F, 7.5F),
                          Transformation.Interpolations.LINEAL
                      ),
                      new Keyframe(
                          0.625F,
                          AnimationHelper.rotation(0.0F, -5.0F, 0.0F),
                          Transformation.Interpolations.LINEAL
                      ),
                      new Keyframe(
                          0.9583F,
                          AnimationHelper.rotation(-7.5F, 0.33F, -7.5F),
                          Transformation.Interpolations.LINEAL
                      ),
                      new Keyframe(
                          1.25F,
                          AnimationHelper.rotation(0.0F, 5.0F, 0.0F),
                          Transformation.Interpolations.LINEAL
                      )
                  )
              )
              .build();

    public static final Animation LONG_JUMPING
        = Animation.Builder.create(0.5F)
              .addBoneAnimation(
                  "body",
                  new Transformation(
                      Transformation.Targets.ROTATE,
                      new Keyframe(
                          0.0F,
                          AnimationHelper.rotation(-22.5F, 0.0F, 0.0F),
                          Transformation.Interpolations.LINEAL
                      ),
                      new Keyframe(
                          0.5F,
                          AnimationHelper.rotation(-22.5F, 0.0F, 0.0F),
                          Transformation.Interpolations.LINEAL
                      )
                  )
              )
              .addBoneAnimation(
                  "body",
                  new Transformation(
                      Transformation.Targets.TRANSLATE,
                      new Keyframe(
                          0.0F,
                          AnimationHelper.translate(0.0F, 0.0F, 0.0F),
                          Transformation.Interpolations.LINEAL
                      ),
                      new Keyframe(
                          0.5F,
                          AnimationHelper.translate(0.0F, 0.0F, 0.0F),
                          Transformation.Interpolations.LINEAL
                      )
                  )
              )
              .addBoneAnimation(
                  "left_arm",
                  new Transformation(
                      Transformation.Targets.ROTATE,
                      new Keyframe(
                          0.0F,
                          AnimationHelper.rotation(-56.14F, 0.0F, 0.0F),
                          Transformation.Interpolations.LINEAL
                      ),
                      new Keyframe(
                          0.5F,
                          AnimationHelper.rotation(-56.14F, 0.0F, 0.0F),
                          Transformation.Interpolations.LINEAL
                      )
                  )
              )
              .addBoneAnimation(
                  "left_arm",
                  new Transformation(
                      Transformation.Targets.TRANSLATE,
                      new Keyframe(
                          0.0F,
                          AnimationHelper.translate(0.0F, 1.0F, 0.0F),
                          Transformation.Interpolations.LINEAL
                      ),
                      new Keyframe(
                          0.5F,
                          AnimationHelper.translate(0.0F, 1.0F, 0.0F),
                          Transformation.Interpolations.LINEAL
                      )
                  )
              )
              .addBoneAnimation(
                  "right_arm",
                  new Transformation(
                      Transformation.Targets.ROTATE,
                      new Keyframe(
                          0.0F,
                          AnimationHelper.rotation(-56.14F, 0.0F, 0.0F),
                          Transformation.Interpolations.LINEAL
                      ),
                      new Keyframe(
                          0.5F,
                          AnimationHelper.rotation(-56.14F, 0.0F, 0.0F),
                          Transformation.Interpolations.LINEAL
                      )
                  )
              )
              .addBoneAnimation(
                  "right_arm",
                  new Transformation(
                      Transformation.Targets.TRANSLATE,
                      new Keyframe(
                          0.0F,
                          AnimationHelper.translate(0.0F, 1.0F, 0.0F),
                          Transformation.Interpolations.LINEAL
                      ),
                      new Keyframe(
                          0.5F,
                          AnimationHelper.translate(0.0F, 1.0F, 0.0F),
                          Transformation.Interpolations.LINEAL
                      )
                  )
              )
              .addBoneAnimation(
                  "left_leg",
                  new Transformation(
                      Transformation.Targets.ROTATE,
                      new Keyframe(
                          0.0F,
                          AnimationHelper.rotation(45.0F, 0.0F, 0.0F),
                          Transformation.Interpolations.LINEAL
                      ),
                      new Keyframe(
                          0.5F,
                          AnimationHelper.rotation(45.0F, 0.0F, 0.0F),
                          Transformation.Interpolations.LINEAL
                      )
                  )
              )
              .addBoneAnimation(
                  "left_leg",
                  new Transformation(
                      Transformation.Targets.TRANSLATE,
                      new Keyframe(
                          0.0F,
                          AnimationHelper.translate(0.0F, 0.0F, 0.0F),
                          Transformation.Interpolations.LINEAL
                      ),
                      new Keyframe(
                          0.5F,
                          AnimationHelper.translate(0.0F, 0.0F, 0.0F),
                          Transformation.Interpolations.LINEAL
                      )
                  )
              )
              .addBoneAnimation(
                  "right_leg",
                  new Transformation(
                      Transformation.Targets.ROTATE,
                      new Keyframe(
                          0.0F,
                          AnimationHelper.rotation(45.0F, 0.0F, 0.0F),
                          Transformation.Interpolations.LINEAL
                      ),
                      new Keyframe(
                          0.5F,
                          AnimationHelper.rotation(45.0F, 0.0F, 0.0F),
                          Transformation.Interpolations.LINEAL
                      )
                  )
              )
              .addBoneAnimation(
                  "right_leg",
                  new Transformation(
                      Transformation.Targets.TRANSLATE,
                      new Keyframe(
                          0.0F,
                          AnimationHelper.translate(0.0F, 0.0F, 0.0F),
                          Transformation.Interpolations.LINEAL
                      ),
                      new Keyframe(
                          0.5F,
                          AnimationHelper.translate(0.0F, 0.0F, 0.0F),
                          Transformation.Interpolations.LINEAL
                      )
                  )
              )
              .build();

    public static final Animation USING_TONGUE
        = Animation.Builder.create(0.5f)
              .addBoneAnimation(
                  "head",
                  new Transformation(
                      Transformation.Targets.ROTATE,
                      new Keyframe(
                          0.0f,
                          AnimationHelper.rotation(0.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.LINEAL
                      ),
                      new Keyframe(
                          0.0833f,
                          AnimationHelper.rotation(-60.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.LINEAL
                      ),
                      new Keyframe(
                          0.4167f,
                          AnimationHelper.rotation(-60.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.LINEAL
                      ),
                      new Keyframe(
                          0.5f,
                          AnimationHelper.rotation(0.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.LINEAL
                      )
                  )
              )
              .addBoneAnimation(
                  "head",
                  new Transformation(
                      Transformation.Targets.SCALE,
                      new Keyframe(
                          0.0f,
                          AnimationHelper.rotation(1.0f, 1.0f, 1.0f),
                          Transformation.Interpolations.LINEAL
                      ),
                      new Keyframe(
                          0.0833f,
                          AnimationHelper.rotation(0.998f, 1.0f, 1.0f),
                          Transformation.Interpolations.LINEAL
                      ),
                      new Keyframe(
                          0.4167f,
                          AnimationHelper.rotation(0.998f, 1.0f, 1.0f),
                          Transformation.Interpolations.LINEAL
                      ),
                      new Keyframe(
                          0.5f,
                          AnimationHelper.rotation(1.0f, 1.0f, 1.0f),
                          Transformation.Interpolations.LINEAL
                      )
                  )
              )
              .addBoneAnimation(
                  "tongue",
                  new Transformation(
                      Transformation.Targets.ROTATE,
                      new Keyframe(
                          0.0f,
                          AnimationHelper.rotation(0.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.LINEAL
                      ),
                      new Keyframe(
                          0.0833f,
                          AnimationHelper.rotation(0.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.LINEAL
                      ),
                      new Keyframe(
                          0.4167f,
                          AnimationHelper.rotation(-18.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.LINEAL
                      ),
                      new Keyframe(
                          0.5f,
                          AnimationHelper.rotation(0.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.LINEAL
                      )
                  )
              )
              .addBoneAnimation(
                  "tongue",
                  new Transformation(
                      Transformation.Targets.SCALE,
                      new Keyframe(
                          0.0833f,
                          AnimationHelper.scale(1.0, 1.0, 1.0),
                          Transformation.Interpolations.LINEAL
                      ),
                      new Keyframe(
                          0.1667f,
                          AnimationHelper.scale(0.5, 1.0, 5.0),
                          Transformation.Interpolations.LINEAL
                      ),
                      new Keyframe(
                          0.4167f,
                          AnimationHelper.scale(1.0, 1.0, 1.0),
                          Transformation.Interpolations.LINEAL
                      )
                  )
              )
              .build();

    public static final Animation SWIMMING
        = Animation.Builder.create(1.04167F)
              .looping()
              .addBoneAnimation(
                  "body",
                  new Transformation(
                      Transformation.Targets.ROTATE,
                      new Keyframe(
                          0.0F,
                          AnimationHelper.rotation(0.0F, 0.0F, 0.0F),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          0.3333F,
                          AnimationHelper.rotation(10.0F, 0.0F, 0.0F),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          0.6667F,
                          AnimationHelper.rotation(-10.0F, 0.0F, 0.0F),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          1.0417F,
                          AnimationHelper.rotation(0.0F, 0.0F, 0.0F),
                          Transformation.Interpolations.CATMULL
                      )
                  )
              )
              .addBoneAnimation(
                  "left_arm",
                  new Transformation(
                      Transformation.Targets.ROTATE,
                      new Keyframe(
                          0.0F,
                          AnimationHelper.rotation(90.0F, 22.5F, 0.0F),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          0.4583F,
                          AnimationHelper.rotation(45.0F, 22.5F, 0.0F),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          0.6667F,
                          AnimationHelper.rotation(-22.5F, -22.5F, -22.5F),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          0.875F,
                          AnimationHelper.rotation(-45.0F, -22.5F, 0.0F),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          0.9583F,
                          AnimationHelper.rotation(22.5F, 0.0F, 22.5F),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          1.0417F,
                          AnimationHelper.rotation(90.0F, 22.5F, 0.0F),
                          Transformation.Interpolations.CATMULL
                      )
                  )
              )
              .addBoneAnimation(
                  "left_arm",
                  new Transformation(
                      Transformation.Targets.TRANSLATE,
                      new Keyframe(
                          0.0F,
                          AnimationHelper.translate(0.0F, -0.64F, 2.0F),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          0.4583F,
                          AnimationHelper.translate(0.0F, -0.64F, 0.0F),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          0.6667F,
                          AnimationHelper.translate(0.0F, 0.0F, 0.0F),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          0.875F,
                          AnimationHelper.translate(0.0F, -0.27F, -1.14F),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          0.9583F,
                          AnimationHelper.translate(0.0F, -1.45F, 0.43F),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          1.0417F,
                          AnimationHelper.translate(0.0F, -0.64F, 2.0F),
                          Transformation.Interpolations.CATMULL
                      )
                  )
              )
              .addBoneAnimation(
                  "right_arm",
                  new Transformation(
                      Transformation.Targets.ROTATE,
                      new Keyframe(
                          0.0F,
                          AnimationHelper.rotation(90.0F, -22.5F, 0.0F),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          0.4583F,
                          AnimationHelper.rotation(45.0F, -22.5F, 0.0F),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          0.6667F,
                          AnimationHelper.rotation(-22.5F, 22.5F, 22.5F),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          0.875F,
                          AnimationHelper.rotation(-45.0F, 22.5F, 0.0F),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          0.9583F,
                          AnimationHelper.rotation(22.5F, 0.0F, -22.5F),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          1.0417F,
                          AnimationHelper.rotation(90.0F, -22.5F, 0.0F),
                          Transformation.Interpolations.CATMULL
                      )
                  )
              )
              .addBoneAnimation(
                  "right_arm",
                  new Transformation(
                      Transformation.Targets.TRANSLATE,
                      new Keyframe(
                          0.0F,
                          AnimationHelper.translate(0.0F, -0.64F, 2.0F),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          0.4583F,
                          AnimationHelper.translate(0.0F, -0.64F, 0.0F),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          0.6667F,
                          AnimationHelper.translate(0.0F, 0.0F, 0.0F),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          0.875F,
                          AnimationHelper.translate(0.0F, -0.27F, -1.14F),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          0.9583F,
                          AnimationHelper.translate(0.0F, -1.45F, 0.43F),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          1.0417F,
                          AnimationHelper.translate(0.0F, -0.64F, 2.0F),
                          Transformation.Interpolations.CATMULL
                      )
                  )
              )
              .addBoneAnimation(
                  "left_leg",
                  new Transformation(
                      Transformation.Targets.ROTATE,
                      new Keyframe(
                          0.0F,
                          AnimationHelper.rotation(90.0F, 0.0F, 0.0F),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          0.25F,
                          AnimationHelper.rotation(90.0F, 0.0F, 0.0F),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          0.4583F,
                          AnimationHelper.rotation(67.5F, -45.0F, 0.0F),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          0.7917F,
                          AnimationHelper.rotation(90.0F, 45.0F, 0.0F),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          0.9583F,
                          AnimationHelper.rotation(90.0F, 0.0F, 0.0F),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          1.0417F,
                          AnimationHelper.rotation(90.0F, 0.0F, 0.0F),
                          Transformation.Interpolations.CATMULL
                      )
                  )
              )
              .addBoneAnimation(
                  "left_leg",
                  new Transformation(
                      Transformation.Targets.TRANSLATE,
                      new Keyframe(
                          0.0F,
                          AnimationHelper.translate(-2.5F, 0.0F, 1.0F),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          0.25F,
                          AnimationHelper.translate(-2.0F, 0.0F, 1.0F),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          0.4583F,
                          AnimationHelper.translate(1.0F, -2.0F, -1.0F),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          0.7917F,
                          AnimationHelper.translate(0.58F, 0.0F, -2.83F),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          0.9583F,
                          AnimationHelper.translate(-2.5F, 0.0F, 1.0F),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          1.0417F,
                          AnimationHelper.translate(-2.5F, 0.0F, 1.0F),
                          Transformation.Interpolations.CATMULL
                      )
                  )
              )
              .addBoneAnimation(
                  "right_leg",
                  new Transformation(
                      Transformation.Targets.ROTATE,
                      new Keyframe(
                          0.0F,
                          AnimationHelper.rotation(90.0F, 0.0F, 0.0F),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          0.25F,
                          AnimationHelper.rotation(90.0F, 0.0F, 0.0F),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          0.4583F,
                          AnimationHelper.rotation(67.5F, 45.0F, 0.0F),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          0.7917F,
                          AnimationHelper.rotation(90.0F, -45.0F, 0.0F),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          0.9583F,
                          AnimationHelper.rotation(90.0F, 0.0F, 0.0F),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          1.0417F,
                          AnimationHelper.rotation(90.0F, 0.0F, 0.0F),
                          Transformation.Interpolations.CATMULL
                      )
                  )
              )
              .addBoneAnimation(
                  "right_leg",
                  new Transformation(
                      Transformation.Targets.TRANSLATE,
                      new Keyframe(
                          0.0F,
                          AnimationHelper.translate(2.5F, 0.0F, 1.0F),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          0.25F,
                          AnimationHelper.translate(2.0F, 0.0F, 1.0F),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          0.4583F,
                          AnimationHelper.translate(-1.0F, -2.0F, -1.0F),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          0.7917F,
                          AnimationHelper.translate(-0.58F, 0.0F, -2.83F),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          0.9583F,
                          AnimationHelper.translate(2.5F, 0.0F, 1.0F),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          1.0417F,
                          AnimationHelper.translate(2.5F, 0.0F, 1.0F),
                          Transformation.Interpolations.CATMULL
                      )
                  )
              )
              .build();

    public static final Animation IDLING_IN_WATER
        = Animation.Builder.create(3.0F)
              .looping()
              .addBoneAnimation(
                  "body",
                  new Transformation(
                      Transformation.Targets.ROTATE,
                      new Keyframe(
                          0.0F,
                          AnimationHelper.rotation(0.0F, 0.0F, 0.0F),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          1.625F,
                          AnimationHelper.rotation(-10.0F, 0.0F, 0.0F),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          3.0F,
                          AnimationHelper.rotation(0.0F, 0.0F, 0.0F),
                          Transformation.Interpolations.CATMULL
                      )
                  )
              )
              .addBoneAnimation(
                  "left_arm",
                  new Transformation(
                      Transformation.Targets.ROTATE,
                      new Keyframe(
                          0.0F,
                          AnimationHelper.rotation(0.0F, 0.0F, -22.5F),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          2.2083F,
                          AnimationHelper.rotation(0.0F, 0.0F, -45.0F),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          3.0F,
                          AnimationHelper.rotation(0.0F, 0.0F, -22.5F),
                          Transformation.Interpolations.CATMULL
                      )
                  )
              )
              .addBoneAnimation(
                  "left_arm",
                  new Transformation(
                      Transformation.Targets.TRANSLATE,
                      new Keyframe(
                          0.0F,
                          AnimationHelper.translate(-1.0F, 0.0F, 0.0F),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          2.2083F,
                          AnimationHelper.translate(-1.0F, -0.5F, 0.0F),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          3.0F,
                          AnimationHelper.translate(-1.0F, 0.0F, 0.0F),
                          Transformation.Interpolations.CATMULL
                      )
                  )
              )
              .addBoneAnimation(
                  "right_arm",
                  new Transformation(
                      Transformation.Targets.ROTATE,
                      new Keyframe(
                          0.0F,
                          AnimationHelper.rotation(0.0F, 0.0F, 22.5F),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          2.2083F,
                          AnimationHelper.rotation(0.0F, 0.0F, 45.0F),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          3.0F,
                          AnimationHelper.rotation(0.0F, 0.0F, 22.5F),
                          Transformation.Interpolations.CATMULL
                      )
                  )
              )
              .addBoneAnimation(
                  "right_arm",
                  new Transformation(
                      Transformation.Targets.TRANSLATE,
                      new Keyframe(
                          0.0F,
                          AnimationHelper.translate(1.0F, 0.0F, 0.0F),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          2.2083F,
                          AnimationHelper.translate(1.0F, -0.5F, 0.0F),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          3.0F,
                          AnimationHelper.translate(1.0F, 0.0F, 0.0F),
                          Transformation.Interpolations.CATMULL
                      )
                  )
              )
              .addBoneAnimation(
                  "left_leg",
                  new Transformation(
                      Transformation.Targets.ROTATE,
                      new Keyframe(
                          0.0F,
                          AnimationHelper.rotation(22.5F, -22.5F, 0.0F),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          1.0F,
                          AnimationHelper.rotation(22.5F, -22.5F, -45.0F),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          3.0F,
                          AnimationHelper.rotation(22.5F, -22.5F, 0.0F),
                          Transformation.Interpolations.CATMULL
                      )
                  )
              )
              .addBoneAnimation(
                  "left_leg",
                  new Transformation(
                      Transformation.Targets.TRANSLATE,
                      new Keyframe(
                          0.0F,
                          AnimationHelper.translate(0.0F, 0.0F, 1.0F),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          1.0F,
                          AnimationHelper.translate(0.0F, -1.0F, 1.0F),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          3.0F,
                          AnimationHelper.translate(0.0F, 0.0F, 1.0F),
                          Transformation.Interpolations.CATMULL
                      )
                  )
              )
              .addBoneAnimation(
                  "right_leg",
                  new Transformation(
                      Transformation.Targets.ROTATE,
                      new Keyframe(
                          0.0F,
                          AnimationHelper.rotation(22.5F, 22.5F, 0.0F),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          1.0F,
                          AnimationHelper.rotation(22.5F, 22.5F, 45.0F),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          3.0F,
                          AnimationHelper.rotation(22.5F, 22.5F, 0.0F),
                          Transformation.Interpolations.CATMULL
                      )
                  )
              )
              .addBoneAnimation(
                  "right_leg",
                  new Transformation(
                      Transformation.Targets.TRANSLATE,
                      new Keyframe(
                          0.0F,
                          AnimationHelper.translate(0.0F, 0.0F, 1.0F),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          1.0F,
                          AnimationHelper.translate(0.0F, -1.0F, 1.0F),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          3.0F,
                          AnimationHelper.translate(0.0F, 0.0F, 1.0F),
                          Transformation.Interpolations.CATMULL
                      )
                  )
              )
              .build();
}