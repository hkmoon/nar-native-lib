
#include <stdio.h>
#include "c_hello.h"

JNIEXPORT void JNICALL Java_c_hello_test
  (JNIEnv *env, jclass clazz)
{
	fprintf(stderr, "Successfully testing c\n");
}

JNIEXPORT jstring JNICALL Java_c_hello_sayHello
  (JNIEnv *env, jclass clazz)
{
	jstring value;

	char buf[40];

	sprintf(buf, "%s", "Hello from JNI!");

	value = (*env)->NewStringUTF( env, buf );

    return value;
}
