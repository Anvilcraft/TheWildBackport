package com.cursedcauldron.wildbackport.client.animation;

import com.cursedcauldron.wildbackport.client.animation.api.Animation;
import com.cursedcauldron.wildbackport.client.animation.api.AnimationHelper;
import com.cursedcauldron.wildbackport.client.animation.api.Keyframe;
import com.cursedcauldron.wildbackport.client.animation.api.Transformation;

public class WardenAnimations {
    public static final Animation EMERGING
        = Animation.Builder.create(6.68f)
              .addBoneAnimation(
                  "body",
                  new Transformation(
                      Transformation.Targets.ROTATE,
                      new Keyframe(
                          0.0f,
                          AnimationHelper.rotation(0.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          0.52f,
                          AnimationHelper.rotation(0.0f, 0.0f, -22.5f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          1.2f,
                          AnimationHelper.rotation(0.0f, 0.0f, -7.5f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          1.68f,
                          AnimationHelper.rotation(0.0f, 0.0f, 10.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          1.8f,
                          AnimationHelper.rotation(0.0f, 0.0f, 10.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          2.28f,
                          AnimationHelper.rotation(0.0f, 0.0f, 10.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          2.88f,
                          AnimationHelper.rotation(0.0f, 0.0f, 10.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          3.76f,
                          AnimationHelper.rotation(25.0f, 0.0f, -7.5f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          3.92f,
                          AnimationHelper.rotation(35.0f, 0.0f, -7.5f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          4.08f,
                          AnimationHelper.rotation(25.0f, 0.0f, -7.5f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          4.44f,
                          AnimationHelper.rotation(47.5f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          4.56f,
                          AnimationHelper.rotation(47.5f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          4.68f,
                          AnimationHelper.rotation(47.5f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          5.0f,
                          AnimationHelper.rotation(70.0f, 0.0f, 2.5f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          5.8f,
                          AnimationHelper.rotation(70.0f, 0.0f, 2.5f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          6.64f,
                          AnimationHelper.rotation(0.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      )
                  )
              )
              .addBoneAnimation(
                  "body",
                  new Transformation(
                      Transformation.Targets.TRANSLATE,
                      new Keyframe(
                          0.0f,
                          AnimationHelper.translate(0.0f, -63.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          0.52f,
                          AnimationHelper.translate(0.0f, -56.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          1.2f,
                          AnimationHelper.translate(0.0f, -32.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          1.68f,
                          AnimationHelper.translate(0.0f, -32.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          1.8f,
                          AnimationHelper.translate(0.0f, -32.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          2.28f,
                          AnimationHelper.translate(0.0f, -32.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          2.88f,
                          AnimationHelper.translate(0.0f, -32.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          3.16f,
                          AnimationHelper.translate(0.0f, -27.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          3.76f,
                          AnimationHelper.translate(0.0f, -14.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          3.92f,
                          AnimationHelper.translate(0.0f, -11.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          4.08f,
                          AnimationHelper.translate(0.0f, -14.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          4.44f,
                          AnimationHelper.translate(0.0f, -6.0f, -3.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          4.56f,
                          AnimationHelper.translate(0.0f, -4.0f, -3.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          4.68f,
                          AnimationHelper.translate(0.0f, -6.0f, -3.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          5.0f,
                          AnimationHelper.translate(0.0f, -3.0f, -4.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          5.8f,
                          AnimationHelper.translate(0.0f, -3.0f, -4.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          6.64f,
                          AnimationHelper.translate(0.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      )
                  )
              )
              .addBoneAnimation(
                  "head",
                  new Transformation(
                      Transformation.Targets.ROTATE,
                      new Keyframe(
                          0.0f,
                          AnimationHelper.rotation(0.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          0.52f,
                          AnimationHelper.rotation(0.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          0.92f,
                          AnimationHelper.rotation(0.74f, 0.0f, -40.38f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          1.16f,
                          AnimationHelper.rotation(-67.5f, 0.0f, -2.5f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          1.24f,
                          AnimationHelper.rotation(-67.5f, 0.0f, -2.5f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          1.32f,
                          AnimationHelper.rotation(-47.5f, 0.0f, -2.5f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          1.4f,
                          AnimationHelper.rotation(-67.5f, 0.0f, -2.5f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          1.68f,
                          AnimationHelper.rotation(-67.5f, 0.0f, 15.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          1.76f,
                          AnimationHelper.rotation(-67.5f, 0.0f, -5.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          1.84f,
                          AnimationHelper.rotation(-52.5f, 0.0f, -5.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          1.92f,
                          AnimationHelper.rotation(-67.5f, 0.0f, -5.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          2.64f,
                          AnimationHelper.rotation(-17.5f, 0.0f, -10.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          3.76f,
                          AnimationHelper.rotation(70.0f, 0.0f, 12.5f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          4.04f,
                          AnimationHelper.rotation(70.0f, 0.0f, 12.5f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          4.12f,
                          AnimationHelper.rotation(80.0f, 0.0f, 12.5f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          4.24f,
                          AnimationHelper.rotation(70.0f, 0.0f, 12.5f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          5.0f,
                          AnimationHelper.rotation(77.5f, 0.0f, -2.5f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          6.64f,
                          AnimationHelper.rotation(0.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      )
                  )
              )
              .addBoneAnimation(
                  "head",
                  new Transformation(
                      Transformation.Targets.TRANSLATE,
                      new Keyframe(
                          0.0f,
                          AnimationHelper.translate(0.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          0.52f,
                          AnimationHelper.translate(-8.0f, -11.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          0.92f,
                          AnimationHelper.translate(0.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          1.24f,
                          AnimationHelper.translate(0.0f, 0.47f, -0.95f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          1.32f,
                          AnimationHelper.translate(0.0f, 0.47f, -0.95f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          1.4f,
                          AnimationHelper.translate(0.0f, 0.47f, -0.95f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          1.68f,
                          AnimationHelper.translate(0.0f, 1.0f, -2.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          1.76f,
                          AnimationHelper.translate(0.0f, 1.0f, -2.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          1.84f,
                          AnimationHelper.translate(0.0f, 1.0f, -2.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          1.92f,
                          AnimationHelper.translate(0.0f, 1.0f, -2.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          2.64f,
                          AnimationHelper.translate(0.0f, -2.0f, -2.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          3.76f,
                          AnimationHelper.translate(0.0f, -4.0f, 1.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          4.04f,
                          AnimationHelper.translate(0.0f, -1.0f, 1.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          4.12f,
                          AnimationHelper.translate(0.0f, -1.0f, 1.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          4.24f,
                          AnimationHelper.translate(0.0f, -1.0f, 1.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          5.0f,
                          AnimationHelper.translate(0.0f, -1.0f, 1.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          6.64f,
                          AnimationHelper.translate(0.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      )
                  )
              )
              .addBoneAnimation(
                  "right_ear",
                  new Transformation(
                      Transformation.Targets.ROTATE,
                      new Keyframe(
                          0.0f,
                          AnimationHelper.rotation(0.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          0.52f,
                          AnimationHelper.rotation(0.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          2.28f,
                          AnimationHelper.rotation(0.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          2.88f,
                          AnimationHelper.rotation(0.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          3.36f,
                          AnimationHelper.rotation(0.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          4.56f,
                          AnimationHelper.rotation(0.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          5.0f,
                          AnimationHelper.rotation(0.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          5.8f,
                          AnimationHelper.rotation(0.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          6.64f,
                          AnimationHelper.rotation(0.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      )
                  )
              )
              .addBoneAnimation(
                  "right_ear",
                  new Transformation(
                      Transformation.Targets.TRANSLATE,
                      new Keyframe(
                          0.0f,
                          AnimationHelper.translate(0.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          0.52f,
                          AnimationHelper.translate(0.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          2.28f,
                          AnimationHelper.translate(0.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          2.88f,
                          AnimationHelper.translate(0.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          3.36f,
                          AnimationHelper.translate(0.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          4.56f,
                          AnimationHelper.translate(0.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          5.0f,
                          AnimationHelper.translate(0.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          5.8f,
                          AnimationHelper.translate(0.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          6.64f,
                          AnimationHelper.translate(0.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      )
                  )
              )
              .addBoneAnimation(
                  "left_ear",
                  new Transformation(
                      Transformation.Targets.ROTATE,
                      new Keyframe(
                          0.0f,
                          AnimationHelper.rotation(0.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          0.52f,
                          AnimationHelper.rotation(0.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          2.28f,
                          AnimationHelper.rotation(0.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          2.88f,
                          AnimationHelper.rotation(0.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          3.36f,
                          AnimationHelper.rotation(0.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          4.56f,
                          AnimationHelper.rotation(0.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          5.0f,
                          AnimationHelper.rotation(0.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          5.8f,
                          AnimationHelper.rotation(0.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          6.64f,
                          AnimationHelper.rotation(0.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      )
                  )
              )
              .addBoneAnimation(
                  "left_ear",
                  new Transformation(
                      Transformation.Targets.TRANSLATE,
                      new Keyframe(
                          0.0f,
                          AnimationHelper.translate(0.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          0.52f,
                          AnimationHelper.translate(0.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          2.28f,
                          AnimationHelper.translate(0.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          2.88f,
                          AnimationHelper.translate(0.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          3.36f,
                          AnimationHelper.translate(0.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          4.56f,
                          AnimationHelper.translate(0.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          5.0f,
                          AnimationHelper.translate(0.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          5.8f,
                          AnimationHelper.translate(0.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          6.64f,
                          AnimationHelper.translate(0.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      )
                  )
              )
              .addBoneAnimation(
                  "right_arm",
                  new Transformation(
                      Transformation.Targets.ROTATE,
                      new Keyframe(
                          0.0f,
                          AnimationHelper.rotation(0.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          0.52f,
                          AnimationHelper.rotation(0.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          1.2f,
                          AnimationHelper.rotation(-152.5f, 2.5f, 7.5f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          1.68f,
                          AnimationHelper.rotation(-180.0f, 12.5f, -10.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          1.8f,
                          AnimationHelper.rotation(-90.0f, 12.5f, -10.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          2.28f,
                          AnimationHelper.rotation(-90.0f, 12.5f, -10.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          2.88f,
                          AnimationHelper.rotation(-90.0f, 12.5f, -10.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          3.08f,
                          AnimationHelper.rotation(-95.0f, 12.5f, -10.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          3.24f,
                          AnimationHelper.rotation(-83.93f, 3.93f, 5.71f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          3.36f,
                          AnimationHelper.rotation(-80.0f, 7.5f, 17.5f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          3.76f,
                          AnimationHelper.rotation(-67.5f, 2.5f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          4.08f,
                          AnimationHelper.rotation(-67.5f, 2.5f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          4.44f,
                          AnimationHelper.rotation(-55.0f, 2.5f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          4.56f,
                          AnimationHelper.rotation(-60.0f, 2.5f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          4.68f,
                          AnimationHelper.rotation(-55.0f, 2.5f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          5.0f,
                          AnimationHelper.rotation(-67.5f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          5.56f,
                          AnimationHelper.rotation(-50.45f, 0.0f, 2.69f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          6.08f,
                          AnimationHelper.rotation(-62.72f, 0.0f, 4.3f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          6.64f,
                          AnimationHelper.rotation(0.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      )
                  )
              )
              .addBoneAnimation(
                  "right_arm",
                  new Transformation(
                      Transformation.Targets.TRANSLATE,
                      new Keyframe(
                          0.0f,
                          AnimationHelper.translate(0.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          0.52f,
                          AnimationHelper.translate(0.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          1.2f,
                          AnimationHelper.translate(0.0f, -21.0f, 9.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          1.68f,
                          AnimationHelper.translate(2.0f, -2.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          1.8f,
                          AnimationHelper.translate(2.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          2.28f,
                          AnimationHelper.translate(2.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          2.88f,
                          AnimationHelper.translate(2.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          3.08f,
                          AnimationHelper.translate(2.0f, -2.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          3.24f,
                          AnimationHelper.translate(2.0f, 2.71f, 3.86f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          3.36f,
                          AnimationHelper.translate(2.0f, 1.0f, 5.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          3.76f,
                          AnimationHelper.translate(2.0f, 3.0f, 3.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          4.08f,
                          AnimationHelper.translate(2.0f, 3.0f, 3.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          4.44f,
                          AnimationHelper.translate(2.67f, 4.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          4.56f,
                          AnimationHelper.translate(2.67f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          4.68f,
                          AnimationHelper.translate(2.67f, 4.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          5.0f,
                          AnimationHelper.translate(0.67f, 3.0f, 4.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          6.64f,
                          AnimationHelper.translate(0.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      )
                  )
              )
              .addBoneAnimation(
                  "left_arm",
                  new Transformation(
                      Transformation.Targets.ROTATE,
                      new Keyframe(
                          0.0f,
                          AnimationHelper.rotation(0.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          0.12f,
                          AnimationHelper.rotation(-167.5f, -17.5f, -7.5f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          0.6f,
                          AnimationHelper.rotation(-167.5f, -17.5f, -7.5f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          0.88f,
                          AnimationHelper.rotation(-175.0f, -17.5f, 15.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          1.16f,
                          AnimationHelper.rotation(-190.0f, -17.5f, 5.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          1.28f,
                          AnimationHelper.rotation(-90.0f, -5.0f, 5.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          1.68f,
                          AnimationHelper.rotation(-90.0f, -17.5f, -12.5f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          1.8f,
                          AnimationHelper.rotation(-90.0f, -17.5f, -12.5f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          2.28f,
                          AnimationHelper.rotation(-90.0f, -17.5f, -12.5f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          2.88f,
                          AnimationHelper.rotation(-90.0f, -17.5f, -12.5f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          3.04f,
                          AnimationHelper.rotation(-81.29f, -10.64f, -14.21f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          3.16f,
                          AnimationHelper.rotation(-83.5f, -5.5f, -15.5f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          3.76f,
                          AnimationHelper.rotation(-62.5f, -7.5f, 5.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          3.92f,
                          AnimationHelper.rotation(-58.75f, -3.75f, 5.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          4.08f,
                          AnimationHelper.rotation(-55.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          4.44f,
                          AnimationHelper.rotation(-52.5f, 0.0f, 5.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          4.56f,
                          AnimationHelper.rotation(-50.0f, 0.0f, 5.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          4.68f,
                          AnimationHelper.rotation(-52.5f, 0.0f, 5.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          5.0f,
                          AnimationHelper.rotation(-72.5f, -2.5f, 5.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          5.56f,
                          AnimationHelper.rotation(-57.5f, -4.54f, 2.99f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          6.08f,
                          AnimationHelper.rotation(-70.99f, -5.77f, 1.78f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          6.64f,
                          AnimationHelper.rotation(0.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      )
                  )
              )
              .addBoneAnimation(
                  "left_arm",
                  new Transformation(
                      Transformation.Targets.TRANSLATE,
                      new Keyframe(
                          0.0f,
                          AnimationHelper.translate(0.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          0.12f,
                          AnimationHelper.translate(0.0f, -8.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          0.6f,
                          AnimationHelper.translate(0.0f, -8.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          0.88f,
                          AnimationHelper.translate(0.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          1.2f,
                          AnimationHelper.translate(-2.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          1.68f,
                          AnimationHelper.translate(-4.0f, 3.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          1.8f,
                          AnimationHelper.translate(-4.0f, 3.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          2.28f,
                          AnimationHelper.translate(-4.0f, 3.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          2.88f,
                          AnimationHelper.translate(-4.0f, 3.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          3.04f,
                          AnimationHelper.translate(-3.23f, 5.7f, 4.97f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          3.16f,
                          AnimationHelper.translate(-1.49f, 2.22f, 5.25f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          3.76f,
                          AnimationHelper.translate(-1.14f, 1.71f, 1.86f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          3.92f,
                          AnimationHelper.translate(-1.14f, 1.21f, 3.86f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          4.08f,
                          AnimationHelper.translate(-1.14f, 2.71f, 4.86f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          4.44f,
                          AnimationHelper.translate(-1.0f, 1.0f, 3.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          4.56f,
                          AnimationHelper.translate(0.0f, 1.0f, 1.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          4.68f,
                          AnimationHelper.translate(0.0f, 1.0f, 3.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          5.0f,
                          AnimationHelper.translate(-2.0f, 0.0f, 4.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          6.64f,
                          AnimationHelper.translate(0.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      )
                  )
              )
              .addBoneAnimation(
                  "right_leg",
                  new Transformation(
                      Transformation.Targets.ROTATE,
                      new Keyframe(
                          0.0f,
                          AnimationHelper.rotation(0.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          0.52f,
                          AnimationHelper.rotation(0.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          2.28f,
                          AnimationHelper.rotation(0.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          2.88f,
                          AnimationHelper.rotation(0.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          3.36f,
                          AnimationHelper.rotation(0.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          4.32f,
                          AnimationHelper.rotation(0.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          4.48f,
                          AnimationHelper.rotation(55.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          4.6f,
                          AnimationHelper.rotation(0.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          5.0f,
                          AnimationHelper.rotation(0.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          5.8f,
                          AnimationHelper.rotation(0.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          6.64f,
                          AnimationHelper.rotation(0.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      )
                  )
              )
              .addBoneAnimation(
                  "right_leg",
                  new Transformation(
                      Transformation.Targets.TRANSLATE,
                      new Keyframe(
                          0.0f,
                          AnimationHelper.translate(0.0f, -63.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          0.52f,
                          AnimationHelper.translate(0.0f, -56.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          1.2f,
                          AnimationHelper.translate(0.0f, -32.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          1.68f,
                          AnimationHelper.translate(0.0f, -32.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          1.8f,
                          AnimationHelper.translate(0.0f, -32.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          2.28f,
                          AnimationHelper.translate(0.0f, -32.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          2.88f,
                          AnimationHelper.translate(0.0f, -32.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          3.36f,
                          AnimationHelper.translate(0.0f, -22.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          3.76f,
                          AnimationHelper.translate(0.0f, -12.28f, 2.48f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          3.92f,
                          AnimationHelper.translate(0.0f, -9.28f, 2.48f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          4.08f,
                          AnimationHelper.translate(0.0f, -12.28f, 2.48f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          4.32f,
                          AnimationHelper.translate(0.0f, -4.14f, 4.14f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          4.48f,
                          AnimationHelper.translate(0.0f, -0.57f, -8.43f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          4.6f,
                          AnimationHelper.translate(0.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          5.0f,
                          AnimationHelper.translate(0.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          5.8f,
                          AnimationHelper.translate(0.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          6.64f,
                          AnimationHelper.translate(0.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      )
                  )
              )
              .addBoneAnimation(
                  "left_leg",
                  new Transformation(
                      Transformation.Targets.ROTATE,
                      new Keyframe(
                          0.0f,
                          AnimationHelper.rotation(0.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          0.52f,
                          AnimationHelper.rotation(0.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          2.28f,
                          AnimationHelper.rotation(0.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          2.88f,
                          AnimationHelper.rotation(0.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          3.36f,
                          AnimationHelper.rotation(0.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          3.84f,
                          AnimationHelper.rotation(20.0f, 0.0f, -17.5f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          4.0f,
                          AnimationHelper.rotation(0.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          4.68f,
                          AnimationHelper.rotation(20.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          4.84f,
                          AnimationHelper.rotation(10.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          5.0f,
                          AnimationHelper.rotation(0.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          5.8f,
                          AnimationHelper.rotation(0.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          6.64f,
                          AnimationHelper.rotation(0.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      )
                  )
              )
              .addBoneAnimation(
                  "left_leg",
                  new Transformation(
                      Transformation.Targets.TRANSLATE,
                      new Keyframe(
                          0.0f,
                          AnimationHelper.translate(0.0f, -63.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          0.52f,
                          AnimationHelper.translate(0.0f, -56.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          1.2f,
                          AnimationHelper.translate(0.0f, -32.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          1.68f,
                          AnimationHelper.translate(0.0f, -32.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          1.8f,
                          AnimationHelper.translate(0.0f, -32.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          2.28f,
                          AnimationHelper.translate(0.0f, -32.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          2.88f,
                          AnimationHelper.translate(0.0f, -32.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          3.36f,
                          AnimationHelper.translate(0.0f, -22.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          3.84f,
                          AnimationHelper.translate(-4.0f, 2.0f, -7.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          4.0f,
                          AnimationHelper.translate(-4.0f, 0.0f, -5.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          4.68f,
                          AnimationHelper.translate(-4.0f, 0.0f, -9.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          4.84f,
                          AnimationHelper.translate(-2.0f, 2.0f, -3.5f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          5.0f,
                          AnimationHelper.translate(0.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          5.8f,
                          AnimationHelper.translate(0.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          6.64f,
                          AnimationHelper.translate(0.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      )
                  )
              )
              .build();
    public static final Animation DIGGING
        = Animation.Builder.create(5.0f)
              .addBoneAnimation(
                  "body",
                  new Transformation(
                      Transformation.Targets.ROTATE,
                      new Keyframe(
                          0.0f,
                          AnimationHelper.rotation(0.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          0.25f,
                          AnimationHelper.rotation(4.13441f, 0.94736f, 1.2694f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          0.5f,
                          AnimationHelper.rotation(50.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          0.7083f,
                          AnimationHelper.rotation(54.45407f, -13.53935f, -18.14183f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          1.0417f,
                          AnimationHelper.rotation(59.46442f, -10.8885f, 35.7954f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          1.3333f,
                          AnimationHelper.rotation(82.28261f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          1.625f,
                          AnimationHelper.rotation(53.23606f, 10.04715f, -29.72932f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          2.2083f,
                          AnimationHelper.rotation(-17.71739f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          2.5417f,
                          AnimationHelper.rotation(112.28261f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          2.6667f,
                          AnimationHelper.rotation(116.06889f, 5.11581f, -24.50117f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          2.8333f,
                          AnimationHelper.rotation(121.56244f, -4.17248f, 19.57737f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          3.0417f,
                          AnimationHelper.rotation(138.5689f, 5.11581f, -24.50117f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          3.25f,
                          AnimationHelper.rotation(144.06244f, -4.17248f, 19.57737f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          3.375f,
                          AnimationHelper.rotation(147.28261f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          3.625f,
                          AnimationHelper.rotation(147.28261f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          3.875f,
                          AnimationHelper.rotation(134.36221f, 8.81113f, -8.90172f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          4.0417f,
                          AnimationHelper.rotation(132.05966f, -8.35927f, 9.70506f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          4.25f,
                          AnimationHelper.rotation(134.36221f, 8.81113f, -8.90172f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          4.5f,
                          AnimationHelper.rotation(147.5f, 0.0f, 0.0f),
                          Transformation.Interpolations.LINEAL
                      )
                  )
              )
              .addBoneAnimation(
                  "body",
                  new Transformation(
                      Transformation.Targets.TRANSLATE,
                      new Keyframe(
                          0.0f,
                          AnimationHelper.translate(0.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          0.5f,
                          AnimationHelper.translate(0.0f, -16.48454f, -6.5784f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          0.7083f,
                          AnimationHelper.translate(0.0f, -16.48454f, -6.5784f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          1.0417f,
                          AnimationHelper.translate(0.0f, -16.97f, -7.11f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          1.625f,
                          AnimationHelper.translate(0.0f, -13.97f, -7.11f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          2.2083f,
                          AnimationHelper.translate(0.0f, -11.48454f, -0.5784f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          2.5417f,
                          AnimationHelper.translate(0.0f, -16.48454f, -6.5784f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          2.6667f,
                          AnimationHelper.translate(0.0f, -20.27f, -5.42f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          3.375f,
                          AnimationHelper.translate(0.0f, -21.48454f, -5.5784f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          4.0417f,
                          AnimationHelper.translate(0.0f, -22.48454f, -5.5784f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          4.5f,
                          AnimationHelper.translate(0.0f, -40.0f, -8.0f),
                          Transformation.Interpolations.LINEAL
                      )
                  )
              )
              .addBoneAnimation(
                  "head",
                  new Transformation(
                      Transformation.Targets.ROTATE,
                      new Keyframe(
                          0.0f,
                          AnimationHelper.rotation(0.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          0.6667f,
                          AnimationHelper.rotation(12.5f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          1.2083f,
                          AnimationHelper.rotation(12.5f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          1.75f,
                          AnimationHelper.rotation(45.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          2.375f,
                          AnimationHelper.rotation(-22.5f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          2.5417f,
                          AnimationHelper.rotation(67.5f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          4.375f,
                          AnimationHelper.rotation(67.5f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      )
                  )
              )
              .addBoneAnimation(
                  "head",
                  new Transformation(
                      Transformation.Targets.TRANSLATE,
                      new Keyframe(
                          0.0f,
                          AnimationHelper.translate(0.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          4.375f,
                          AnimationHelper.translate(0.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.LINEAL
                      )
                  )
              )
              .addBoneAnimation(
                  "right_arm",
                  new Transformation(
                      Transformation.Targets.ROTATE,
                      new Keyframe(
                          0.0f,
                          AnimationHelper.rotation(0.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          0.5f,
                          AnimationHelper.rotation(-101.8036f, -21.29587f, 30.61478f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          0.7083f,
                          AnimationHelper.rotation(-101.8036f, -21.29587f, 30.61478f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          1.0f,
                          AnimationHelper.rotation(48.7585f, -17.61941f, 9.9865f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          1.1667f,
                          AnimationHelper.rotation(48.7585f, -17.61941f, 9.9865f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          1.4583f,
                          AnimationHelper.rotation(-101.8036f, -21.29587f, 30.61478f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          1.75f,
                          AnimationHelper.rotation(-89.04994f, -4.19657f, -1.47845f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          2.2083f,
                          AnimationHelper.rotation(-158.30728f, 3.7152f, -1.52352f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          2.5417f,
                          AnimationHelper.rotation(-89.04994f, -4.19657f, -1.47845f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          4.375f,
                          AnimationHelper.rotation(-120.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      )
                  )
              )
              .addBoneAnimation(
                  "right_arm",
                  new Transformation(
                      Transformation.Targets.TRANSLATE,
                      new Keyframe(
                          0.0f,
                          AnimationHelper.translate(0.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          0.7083f,
                          AnimationHelper.translate(2.22f, 0.0f, 0.86f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          1.0f,
                          AnimationHelper.translate(3.12f, 0.0f, 4.29f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          2.2083f,
                          AnimationHelper.translate(1.0f, 0.0f, 4.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          4.375f,
                          AnimationHelper.translate(0.0f, 0.0f, 4.0f),
                          Transformation.Interpolations.CATMULL
                      )
                  )
              )
              .addBoneAnimation(
                  "left_arm",
                  new Transformation(
                      Transformation.Targets.ROTATE,
                      new Keyframe(
                          0.0f,
                          AnimationHelper.rotation(0.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          0.2917f,
                          AnimationHelper.rotation(-63.89288f, -0.52011f, 2.09491f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          0.5f,
                          AnimationHelper.rotation(-63.89288f, -0.52011f, 2.09491f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          0.7083f,
                          AnimationHelper.rotation(-62.87857f, 15.15061f, 9.97445f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          0.9167f,
                          AnimationHelper.rotation(-86.93642f, 17.45026f, 4.05284f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          1.1667f,
                          AnimationHelper.rotation(-86.93642f, 17.45026f, 4.05284f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          1.4583f,
                          AnimationHelper.rotation(-86.93642f, 17.45026f, 4.05284f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          1.6667f,
                          AnimationHelper.rotation(63.0984f, 8.83573f, -8.71284f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          1.8333f,
                          AnimationHelper.rotation(35.5984f, 8.83573f, -8.71284f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          2.2083f,
                          AnimationHelper.rotation(-153.27473f, -0.02953f, 3.5235f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          2.5417f,
                          AnimationHelper.rotation(-87.07754f, -0.02625f, 3.132f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          4.375f,
                          AnimationHelper.rotation(-120.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.LINEAL
                      )
                  )
              )
              .addBoneAnimation(
                  "left_arm",
                  new Transformation(
                      Transformation.Targets.TRANSLATE,
                      new Keyframe(
                          0.0f,
                          AnimationHelper.translate(0.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          0.5f,
                          AnimationHelper.translate(-0.28f, 5.0f, 10.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          0.7083f,
                          AnimationHelper.translate(-1.51f, 4.35f, 4.33f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          0.9167f,
                          AnimationHelper.translate(-0.6f, 3.61f, 4.63f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          1.1667f,
                          AnimationHelper.translate(-0.6f, 3.61f, 0.63f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          1.6667f,
                          AnimationHelper.translate(-2.85f, -0.1f, 3.33f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          2.2083f,
                          AnimationHelper.translate(-1.0f, 0.0f, 4.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          4.375f,
                          AnimationHelper.translate(0.0f, 0.0f, 4.0f),
                          Transformation.Interpolations.LINEAL
                      )
                  )
              )
              .addBoneAnimation(
                  "right_leg",
                  new Transformation(
                      Transformation.Targets.ROTATE,
                      new Keyframe(
                          0.0f,
                          AnimationHelper.rotation(0.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          0.5f,
                          AnimationHelper.rotation(113.27f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          0.7083f,
                          AnimationHelper.rotation(113.27f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          3.3333f,
                          AnimationHelper.rotation(113.27f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          3.5833f,
                          AnimationHelper.rotation(182.5f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          3.8333f,
                          AnimationHelper.rotation(120.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          4.0833f,
                          AnimationHelper.rotation(182.5f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          4.2917f,
                          AnimationHelper.rotation(120.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          4.5f,
                          AnimationHelper.rotation(90.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.LINEAL
                      )
                  )
              )
              .addBoneAnimation(
                  "right_leg",
                  new Transformation(
                      Transformation.Targets.TRANSLATE,
                      new Keyframe(
                          0.0f,
                          AnimationHelper.translate(0.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          0.5f,
                          AnimationHelper.translate(0.0f, -13.98f, -2.37f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          0.7083f,
                          AnimationHelper.translate(0.0f, -13.98f, -2.37f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          3.3333f,
                          AnimationHelper.translate(0.0f, -13.98f, -2.37f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          3.5833f,
                          AnimationHelper.translate(0.0f, -7.0f, -3.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          3.8333f,
                          AnimationHelper.translate(0.0f, -9.0f, -3.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          4.0833f,
                          AnimationHelper.translate(0.0f, -16.71f, -3.69f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          4.2917f,
                          AnimationHelper.translate(0.0f, -28.0f, -5.0f),
                          Transformation.Interpolations.LINEAL
                      )
                  )
              )
              .addBoneAnimation(
                  "left_leg",
                  new Transformation(
                      Transformation.Targets.ROTATE,
                      new Keyframe(
                          0.0f,
                          AnimationHelper.rotation(0.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          0.5f,
                          AnimationHelper.rotation(114.98f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          0.7083f,
                          AnimationHelper.rotation(114.98f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          3.3333f,
                          AnimationHelper.rotation(114.98f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          3.5833f,
                          AnimationHelper.rotation(90.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          3.8333f,
                          AnimationHelper.rotation(172.5f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          4.0833f,
                          AnimationHelper.rotation(90.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          4.2917f,
                          AnimationHelper.rotation(197.5f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          4.5f,
                          AnimationHelper.rotation(90.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.LINEAL
                      )
                  )
              )
              .addBoneAnimation(
                  "left_leg",
                  new Transformation(
                      Transformation.Targets.TRANSLATE,
                      new Keyframe(
                          0.0f,
                          AnimationHelper.translate(0.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          0.5f,
                          AnimationHelper.translate(0.0f, -14.01f, -2.35f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          0.7083f,
                          AnimationHelper.translate(0.0f, -14.01f, -2.35f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          3.3333f,
                          AnimationHelper.translate(0.0f, -14.01f, -2.35f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          3.5833f,
                          AnimationHelper.translate(0.0f, -5.0f, -4.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          3.8333f,
                          AnimationHelper.translate(0.0f, -7.0f, -4.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          4.0833f,
                          AnimationHelper.translate(0.0f, -15.5f, -3.76f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          4.2917f,
                          AnimationHelper.translate(0.0f, -28.0f, -5.0f),
                          Transformation.Interpolations.LINEAL
                      )
                  )
              )
              .build();
    public static final Animation ROARING
        = Animation.Builder.create(4.2f)
              .addBoneAnimation(
                  "body",
                  new Transformation(
                      Transformation.Targets.ROTATE,
                      new Keyframe(
                          0.0f,
                          AnimationHelper.rotation(0.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          1.24f,
                          AnimationHelper.rotation(-25.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          1.6f,
                          AnimationHelper.rotation(32.5f, 0.0f, -7.5f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          1.84f,
                          AnimationHelper.rotation(38.33f, 0.0f, 2.99f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          2.08f,
                          AnimationHelper.rotation(40.97f, 0.0f, -4.3f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          2.36f,
                          AnimationHelper.rotation(44.41f, 0.0f, 6.29f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          3.0f,
                          AnimationHelper.rotation(47.5f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          4.2f,
                          AnimationHelper.rotation(0.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      )
                  )
              )
              .addBoneAnimation(
                  "body",
                  new Transformation(
                      Transformation.Targets.TRANSLATE,
                      new Keyframe(
                          0.0f,
                          AnimationHelper.translate(0.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          1.24f,
                          AnimationHelper.translate(0.0f, -1.0f, 3.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          1.6f,
                          AnimationHelper.translate(0.0f, -3.0f, -6.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          3.0f,
                          AnimationHelper.translate(0.0f, -3.0f, -6.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          4.2f,
                          AnimationHelper.translate(0.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      )
                  )
              )
              .addBoneAnimation(
                  "head",
                  new Transformation(
                      Transformation.Targets.ROTATE,
                      new Keyframe(
                          0.0f,
                          AnimationHelper.rotation(0.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          1.24f,
                          AnimationHelper.rotation(-32.5f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          1.6f,
                          AnimationHelper.rotation(-32.5f, 0.0f, -27.5f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          1.8f,
                          AnimationHelper.rotation(-32.5f, 0.0f, 26.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          2.04f,
                          AnimationHelper.rotation(-32.5f, 0.0f, -27.5f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          2.44f,
                          AnimationHelper.rotation(-32.5f, 0.0f, 26.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          2.84f,
                          AnimationHelper.rotation(-5.0f, 0.0f, -12.5f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          4.2f,
                          AnimationHelper.rotation(0.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      )
                  )
              )
              .addBoneAnimation(
                  "head",
                  new Transformation(
                      Transformation.Targets.TRANSLATE,
                      new Keyframe(
                          0.0f,
                          AnimationHelper.translate(0.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          1.24f,
                          AnimationHelper.translate(0.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          1.6f,
                          AnimationHelper.translate(0.0f, -2.0f, -6.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          2.2f,
                          AnimationHelper.translate(0.0f, -2.0f, -6.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          2.48f,
                          AnimationHelper.translate(0.0f, -2.0f, -6.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          4.2f,
                          AnimationHelper.translate(0.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      )
                  )
              )
              .addBoneAnimation(
                  "right_ear",
                  new Transformation(
                      Transformation.Targets.ROTATE,
                      new Keyframe(
                          0.0f,
                          AnimationHelper.rotation(0.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          1.24f,
                          AnimationHelper.rotation(0.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          1.76f,
                          AnimationHelper.rotation(0.0f, 0.0f, -10.85f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          2.08f,
                          AnimationHelper.rotation(0.0f, 0.0f, 12.5f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          2.4f,
                          AnimationHelper.rotation(0.0f, 0.0f, -10.85f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          2.72f,
                          AnimationHelper.rotation(0.0f, 0.0f, 12.5f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          3.0f,
                          AnimationHelper.rotation(0.0f, 0.0f, -10.85f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          4.2f,
                          AnimationHelper.rotation(0.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      )
                  )
              )
              .addBoneAnimation(
                  "left_ear",
                  new Transformation(
                      Transformation.Targets.ROTATE,
                      new Keyframe(
                          0.0f,
                          AnimationHelper.rotation(0.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          1.24f,
                          AnimationHelper.rotation(0.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          1.76f,
                          AnimationHelper.rotation(0.0f, 0.0f, -15.85f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          2.08f,
                          AnimationHelper.rotation(0.0f, 0.0f, 12.5f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          2.4f,
                          AnimationHelper.rotation(0.0f, 0.0f, -15.85f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          2.72f,
                          AnimationHelper.rotation(0.0f, 0.0f, 12.5f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          3.0f,
                          AnimationHelper.rotation(0.0f, 0.0f, -15.85f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          4.2f,
                          AnimationHelper.rotation(0.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      )
                  )
              )
              .addBoneAnimation(
                  "right_arm",
                  new Transformation(
                      Transformation.Targets.ROTATE,
                      new Keyframe(
                          0.0f,
                          AnimationHelper.rotation(0.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          0.72f,
                          AnimationHelper.rotation(-120.0f, 0.0f, -20.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          1.24f,
                          AnimationHelper.rotation(-77.5f, 3.75f, 15.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          1.48f,
                          AnimationHelper.rotation(67.5f, -32.5f, 20.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          2.48f,
                          AnimationHelper.rotation(37.5f, -32.5f, 25.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          2.88f,
                          AnimationHelper.rotation(27.6f, -17.1f, 32.5f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          4.2f,
                          AnimationHelper.rotation(0.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      )
                  )
              )
              .addBoneAnimation(
                  "right_arm",
                  new Transformation(
                      Transformation.Targets.TRANSLATE,
                      new Keyframe(
                          0.0f,
                          AnimationHelper.translate(0.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          0.72f,
                          AnimationHelper.translate(3.0f, -2.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          1.48f,
                          AnimationHelper.translate(4.0f, -2.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          2.48f,
                          AnimationHelper.translate(4.0f, -2.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          4.2f,
                          AnimationHelper.translate(0.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      )
                  )
              )
              .addBoneAnimation(
                  "left_arm",
                  new Transformation(
                      Transformation.Targets.ROTATE,
                      new Keyframe(
                          0.0f,
                          AnimationHelper.rotation(0.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          0.72f,
                          AnimationHelper.rotation(-125.0f, 0.0f, 20.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          1.24f,
                          AnimationHelper.rotation(-76.25f, -17.5f, -7.5f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          1.48f,
                          AnimationHelper.rotation(62.5f, 42.5f, -12.5f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          2.48f,
                          AnimationHelper.rotation(37.5f, 27.5f, -27.5f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          2.88f,
                          AnimationHelper.rotation(25.0f, 18.4f, -30.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          4.2f,
                          AnimationHelper.rotation(0.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      )
                  )
              )
              .addBoneAnimation(
                  "left_arm",
                  new Transformation(
                      Transformation.Targets.TRANSLATE,
                      new Keyframe(
                          0.0f,
                          AnimationHelper.translate(0.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          0.72f,
                          AnimationHelper.translate(-3.0f, -2.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          1.48f,
                          AnimationHelper.translate(-4.0f, -2.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          2.48f,
                          AnimationHelper.translate(-4.0f, -2.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          4.2f,
                          AnimationHelper.translate(0.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      )
                  )
              )
              .build();
    public static final Animation SNIFFING
        = Animation.Builder.create(4.16f)
              .addBoneAnimation(
                  "body",
                  new Transformation(
                      Transformation.Targets.ROTATE,
                      new Keyframe(
                          0.0f,
                          AnimationHelper.rotation(0.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          0.56f,
                          AnimationHelper.rotation(17.5f, 32.5f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          0.96f,
                          AnimationHelper.rotation(0.0f, 32.5f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          2.2f,
                          AnimationHelper.rotation(10.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          2.8f,
                          AnimationHelper.rotation(10.0f, -30.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          3.32f,
                          AnimationHelper.rotation(0.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      )
                  )
              )
              .addBoneAnimation(
                  "head",
                  new Transformation(
                      Transformation.Targets.ROTATE,
                      new Keyframe(
                          0.0f,
                          AnimationHelper.rotation(0.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          0.68f,
                          AnimationHelper.rotation(0.0f, 40.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          0.96f,
                          AnimationHelper.rotation(-22.5f, 40.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          1.24f,
                          AnimationHelper.rotation(0.0f, 20.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          1.52f,
                          AnimationHelper.rotation(-35.0f, 20.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          1.76f,
                          AnimationHelper.rotation(0.0f, 20.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          2.28f,
                          AnimationHelper.rotation(0.0f, -20.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          2.88f,
                          AnimationHelper.rotation(0.0f, -20.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          3.32f,
                          AnimationHelper.rotation(0.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      )
                  )
              )
              .addBoneAnimation(
                  "right_arm",
                  new Transformation(
                      Transformation.Targets.ROTATE,
                      new Keyframe(
                          0.0f,
                          AnimationHelper.rotation(0.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          0.96f,
                          AnimationHelper.rotation(17.5f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          2.2f,
                          AnimationHelper.rotation(0.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          2.76f,
                          AnimationHelper.rotation(-15.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          3.32f,
                          AnimationHelper.rotation(0.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      )
                  )
              )
              .addBoneAnimation(
                  "left_arm",
                  new Transformation(
                      Transformation.Targets.ROTATE,
                      new Keyframe(
                          0.0f,
                          AnimationHelper.rotation(0.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          0.96f,
                          AnimationHelper.rotation(-15.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          2.2f,
                          AnimationHelper.rotation(0.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          2.76f,
                          AnimationHelper.rotation(17.5f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          3.32f,
                          AnimationHelper.rotation(0.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      )
                  )
              )
              .build();
    public static final Animation ATTACKING
        = Animation.Builder.create(0.33333f)
              .addBoneAnimation(
                  "body",
                  new Transformation(
                      Transformation.Targets.ROTATE,
                      new Keyframe(
                          0.0f,
                          AnimationHelper.rotation(0.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          0.0417f,
                          AnimationHelper.rotation(-22.5f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          0.2083f,
                          AnimationHelper.rotation(22.5f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          0.3333f,
                          AnimationHelper.rotation(0.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      )
                  )
              )
              .addBoneAnimation(
                  "body",
                  new Transformation(
                      Transformation.Targets.TRANSLATE,
                      new Keyframe(
                          0.0f,
                          AnimationHelper.translate(0.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          0.0417f,
                          AnimationHelper.translate(0.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          0.2083f,
                          AnimationHelper.translate(0.0f, -1.0f, -2.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          0.3333f,
                          AnimationHelper.translate(0.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      )
                  )
              )
              .addBoneAnimation(
                  "head",
                  new Transformation(
                      Transformation.Targets.ROTATE,
                      new Keyframe(
                          0.0f,
                          AnimationHelper.rotation(0.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          0.0417f,
                          AnimationHelper.rotation(22.5f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          0.25f,
                          AnimationHelper.rotation(-30.17493f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          0.3333f,
                          AnimationHelper.rotation(0.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      )
                  )
              )
              .addBoneAnimation(
                  "head",
                  new Transformation(
                      Transformation.Targets.TRANSLATE,
                      new Keyframe(
                          0.0f,
                          AnimationHelper.translate(0.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          0.0417f,
                          AnimationHelper.translate(0.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          0.25f,
                          AnimationHelper.translate(0.0f, -2.0f, -2.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          0.3333f,
                          AnimationHelper.translate(0.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      )
                  )
              )
              .addBoneAnimation(
                  "right_arm",
                  new Transformation(
                      Transformation.Targets.ROTATE,
                      new Keyframe(
                          0.0f,
                          AnimationHelper.rotation(0.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          0.0417f,
                          AnimationHelper.rotation(-120.36119f, 40.78947f, -20.94102f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          0.1667f,
                          AnimationHelper.rotation(-90.0f, -45.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          0.3333f,
                          AnimationHelper.rotation(0.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      )
                  )
              )
              .addBoneAnimation(
                  "right_arm",
                  new Transformation(
                      Transformation.Targets.TRANSLATE,
                      new Keyframe(
                          0.0f,
                          AnimationHelper.translate(0.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          0.0417f,
                          AnimationHelper.translate(4.0f, 0.0f, 5.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          0.1667f,
                          AnimationHelper.translate(0.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          0.3333f,
                          AnimationHelper.translate(0.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      )
                  )
              )
              .addBoneAnimation(
                  "left_arm",
                  new Transformation(
                      Transformation.Targets.ROTATE,
                      new Keyframe(
                          0.0f,
                          AnimationHelper.rotation(0.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          0.0417f,
                          AnimationHelper.rotation(-120.36119f, -40.78947f, 20.94102f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          0.1667f,
                          AnimationHelper.rotation(-61.1632f, 42.85882f, 11.52421f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          0.3333f,
                          AnimationHelper.rotation(0.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      )
                  )
              )
              .addBoneAnimation(
                  "left_arm",
                  new Transformation(
                      Transformation.Targets.TRANSLATE,
                      new Keyframe(
                          0.0f,
                          AnimationHelper.translate(0.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          0.0417f,
                          AnimationHelper.translate(-4.0f, 0.0f, 5.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          0.1667f,
                          AnimationHelper.translate(0.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          0.3333f,
                          AnimationHelper.translate(0.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      )
                  )
              )
              .build();
    public static final Animation SONIC_BOOM
        = Animation.Builder.create(3.0f)
              .addBoneAnimation(
                  "body",
                  new Transformation(
                      Transformation.Targets.ROTATE,
                      new Keyframe(
                          0.0f,
                          AnimationHelper.rotation(0.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          1.0833f,
                          AnimationHelper.rotation(47.5f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          1.625f,
                          AnimationHelper.rotation(55.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          1.9167f,
                          AnimationHelper.rotation(0.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          2.0f,
                          AnimationHelper.rotation(-32.5f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          2.4583f,
                          AnimationHelper.rotation(-32.5f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          2.7083f,
                          AnimationHelper.rotation(0.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          2.875f,
                          AnimationHelper.rotation(0.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      )
                  )
              )
              .addBoneAnimation(
                  "body",
                  new Transformation(
                      Transformation.Targets.TRANSLATE,
                      new Keyframe(
                          0.0f,
                          AnimationHelper.translate(0.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          1.0833f,
                          AnimationHelper.translate(0.0f, -3.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          1.625f,
                          AnimationHelper.translate(0.0f, -4.0f, -1.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          1.9167f,
                          AnimationHelper.translate(0.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          2.7083f,
                          AnimationHelper.translate(0.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          2.875f,
                          AnimationHelper.translate(0.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      )
                  )
              )
              .addBoneAnimation(
                  "right_ribcage",
                  new Transformation(
                      Transformation.Targets.ROTATE,
                      new Keyframe(
                          0.0f,
                          AnimationHelper.rotation(0.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          1.5417f,
                          AnimationHelper.rotation(0.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          1.7917f,
                          AnimationHelper.rotation(0.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          1.875f,
                          AnimationHelper.rotation(0.0f, 125.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          2.5f,
                          AnimationHelper.rotation(0.0f, 125.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          2.6667f,
                          AnimationHelper.rotation(0.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      )
                  )
              )
              .addBoneAnimation(
                  "left_ribcage",
                  new Transformation(
                      Transformation.Targets.ROTATE,
                      new Keyframe(
                          0.0f,
                          AnimationHelper.rotation(0.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          1.5417f,
                          AnimationHelper.rotation(0.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          1.7917f,
                          AnimationHelper.rotation(0.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          1.875f,
                          AnimationHelper.rotation(0.0f, -125.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          2.5f,
                          AnimationHelper.rotation(0.0f, -125.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          2.6667f,
                          AnimationHelper.rotation(0.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      )
                  )
              )
              .addBoneAnimation(
                  "head",
                  new Transformation(
                      Transformation.Targets.ROTATE,
                      new Keyframe(
                          0.0f,
                          AnimationHelper.rotation(0.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          1.0f,
                          AnimationHelper.rotation(67.5f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          1.75f,
                          AnimationHelper.rotation(80.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          1.9167f,
                          AnimationHelper.rotation(-45.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          2.5f,
                          AnimationHelper.rotation(-45.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          2.7083f,
                          AnimationHelper.rotation(-45.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          2.875f,
                          AnimationHelper.rotation(0.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      )
                  )
              )
              .addBoneAnimation(
                  "head",
                  new Transformation(
                      Transformation.Targets.TRANSLATE,
                      new Keyframe(
                          0.0f,
                          AnimationHelper.translate(0.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          1.9167f,
                          AnimationHelper.translate(0.0f, 0.0f, -3.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          2.5f,
                          AnimationHelper.translate(0.0f, 0.0f, -3.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          2.7083f,
                          AnimationHelper.translate(0.0f, 0.0f, -3.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          2.875f,
                          AnimationHelper.translate(0.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      )
                  )
              )
              .addBoneAnimation(
                  "right_arm",
                  new Transformation(
                      Transformation.Targets.ROTATE,
                      new Keyframe(
                          0.0f,
                          AnimationHelper.rotation(0.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          0.875f,
                          AnimationHelper.rotation(-42.28659f, -32.69813f, -5.00825f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          1.1667f,
                          AnimationHelper.rotation(-29.83757f, -35.39626f, -45.28089f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          1.3333f,
                          AnimationHelper.rotation(-29.83757f, -35.39626f, -45.28089f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          1.6667f,
                          AnimationHelper.rotation(-72.28659f, -32.69813f, -5.00825f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          1.8333f,
                          AnimationHelper.rotation(35.26439f, -30.0f, 35.26439f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          1.9167f,
                          AnimationHelper.rotation(73.75484f, -13.0931f, 19.20518f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          2.5f,
                          AnimationHelper.rotation(73.75484f, -13.0931f, 19.20518f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          2.75f,
                          AnimationHelper.rotation(58.20713f, -21.1064f, 28.7261f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          3.0f,
                          AnimationHelper.rotation(0.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      )
                  )
              )
              .addBoneAnimation(
                  "right_arm",
                  new Transformation(
                      Transformation.Targets.TRANSLATE,
                      new Keyframe(
                          0.0f,
                          AnimationHelper.translate(0.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          1.8333f,
                          AnimationHelper.translate(3.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          2.75f,
                          AnimationHelper.translate(3.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          3.0f,
                          AnimationHelper.translate(0.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      )
                  )
              )
              .addBoneAnimation(
                  "left_arm",
                  new Transformation(
                      Transformation.Targets.ROTATE,
                      new Keyframe(
                          0.0f,
                          AnimationHelper.rotation(0.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          0.875f,
                          AnimationHelper.rotation(-33.80694f, 32.31058f, 6.87997f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          1.1667f,
                          AnimationHelper.rotation(-17.87827f, 34.62115f, 49.02433f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          1.3333f,
                          AnimationHelper.rotation(-17.87827f, 34.62115f, 49.02433f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          1.6667f,
                          AnimationHelper.rotation(-51.30694f, 32.31058f, 6.87997f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          1.8333f,
                          AnimationHelper.rotation(35.26439f, 30.0f, -35.26439f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          1.9167f,
                          AnimationHelper.rotation(73.75484f, 13.0931f, -19.20518f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          2.5f,
                          AnimationHelper.rotation(73.75484f, 13.0931f, -19.20518f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          2.75f,
                          AnimationHelper.rotation(58.20713f, 21.1064f, -28.7261f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          3.0f,
                          AnimationHelper.rotation(0.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      )
                  )
              )
              .addBoneAnimation(
                  "left_arm",
                  new Transformation(
                      Transformation.Targets.TRANSLATE,
                      new Keyframe(
                          0.0f,
                          AnimationHelper.translate(0.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          1.8333f,
                          AnimationHelper.translate(-3.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          2.75f,
                          AnimationHelper.translate(-3.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      ),
                      new Keyframe(
                          3.0f,
                          AnimationHelper.translate(0.0f, 0.0f, 0.0f),
                          Transformation.Interpolations.CATMULL
                      )
                  )
              )
              .build();
}