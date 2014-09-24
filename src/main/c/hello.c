
#include <stdio.h>
#include "c_hello.h"

JNIEXPORT jbyte JNICALL Java_c_hello_test
  (JNIEnv *env, jclass clazz)
{
	return (jbyte)108;
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
