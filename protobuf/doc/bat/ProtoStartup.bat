@ rem ----- ��Ϣ -----
@ rem @filename ProtoStartup.bat
@ rem @version 1.0
@ rem @author qye.zheng
@ rem @description Protobuf ������������javaԴ��

@ rem @warning Ϊ�˷�ֹ���Ļ������룬�����ļ���ʱ��Ӧ�ñ���ΪANSI�����ʽ.
@ rem ################################################################################

:: ��ȡbat�ļ����ڵĴ��������������� C:
set currentDriver=%~dp0
set currentDriver=%currentDriver:~0,2%
:: ִ��������������ű������뵱ǰ�ű����ڵ�·��
%currentDriver%
cd %~dp0

:: ִ�� �������� �ű�
call ProtoParam.bat

@ rem ����
@ title Google Protobuf ������
@ rem ########## begin  ##########

@ rem �ر���ʾ���ʹ��������ִ��ǰ����ʾ
@ rem @ echo off
@ echo off
@ rem ��������ʾ @ echo on

@ rem ----- ����������

@ rem ----- ���������

:: �л�����Ŀ�ĸ�Ŀ¼�£���Ŀ¼�� ����� protoc.exe ����
cd ..\..

:: ִ������ java Դ��
protoc --java_out=%outputSrcPath% %protoPath%

@ rem pause

@ rem

@ rem
@ rem �����ʾ��Ϣ

::
:: 1) 
:: 2)
:: 3)
:: 4)
:: 5)
:: 6)
:: 7)
:: 8)
:: 9)
:: 10)

:: �ڳ����ĩβ�����Ը���ִ�еĽ��(�ɹ���ʧ��) ������ʾ��Ϣ���ɹ�����ֱ��ִ��exit����ʧ��
:: ����ִ��pause��Ȼ�����ͨ������̨�����Ϣ�����ԡ���λ����.
:: �����ڳ���������һ���ɹ���ʧ�ܵı�־-����ֵ���������������ִ������.

@ rem echo
@ rem exit
@ rem ########## end of ##########

@ rem ע��˵��: @ rem ע������  ���� :: ע������
@ rem rem ������ð�� ���� ������дע��
